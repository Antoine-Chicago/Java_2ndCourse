import java.util.Objects;
import java.util.Scanner;

class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        Set_X(x);
        Set_Y(y);
        Set_Z(z);
    }
    public Vector3D() {
        this(0,0,0);
    }
    public Vector3D(Point3D a, Point3D b) {
        this.x=a.Get_X()-b.Get_X();
        this.y=a.Get_Y()-b.Get_Y();
        this.z=a.Get_Z()-b.Get_Z();
    }

    public void Set_X(double x) {this.x = x;}
    public void Set_Y(double y) {this.y = y;}
    public void Set_Z(double z) {this.z = z;}

    public double Get_X() {return x;}
    public double Get_Y() {return y;}
    public double Get_Z() {return z;}

    public double VectorLength() {
        return Math.sqrt(x * x + y * y + z * z);

    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Double.compare(x, vector3D.x) == 0 && Double.compare(y, vector3D.y) == 0 && Double.compare(z, vector3D.z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    public static void main(String[] args) {
        //реализация пункт 3
        Scanner in = new Scanner(System.in);
        Vector3D v1 = new Vector3D();
        Vector3D v2 = new Vector3D();
        Vector3D v3 = new Vector3D(3, -5,10);
        Vector3D v4 = new Vector3D(3, -5,10);

        System.out.print("Введите координаты 1 вектора: ");
        v1.Set_X(in.nextDouble());
        v1.Set_Y(in.nextDouble());
        v1.Set_Z(in.nextDouble());
        System.out.print("Введите координаты 2 вектора: ");
        v2.Set_X(in.nextDouble());
        v2.Set_Y(in.nextDouble());
        v2.Set_Z(in.nextDouble());
        System.out.printf("Длина 1 = %f\nДлина 2 = %f\n",v1.VectorLength(),v2.VectorLength());
        if(v1.equals(v2)) System.out.println("Вектора 1,2 равны меж собой");
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println();
        if(v3.equals(v4)) System.out.println("Вектор 3 равен вектору 4");
        System.out.printf("Длина 3 = %f\nДлина 4 = %f\n",v3.VectorLength(),v4.VectorLength());
        System.out.println(v3.toString());
        System.out.println(v4.toString());
    }
}
