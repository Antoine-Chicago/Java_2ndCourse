import java.util.Objects;
import java.util.Scanner;
class Point3D {
    private double x, y, z;

    public Point3D(double x, double y, double z) {
        Set_X(x);
        Set_Y(y);
        Set_Z(z);
    }
    public Point3D() {
        this(0,0,0);
    }

    public void Set_X(double x) {this.x = x;}
    public void Set_Y(double y) {this.y = y;}
    public void Set_Z(double z) {this.z = z;}

    public double Get_X() {return x;}
    public double Get_Y() {return y;}
    public double Get_Z() {return z;}

    public void Show(){System.out.printf("{%.3f; %.3f; %.3f}\n", Get_X(),Get_Y(),Get_Z());}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        //return Double.compare(x, point3D.x) == 0 && Double.compare(y, point3D.y) == 0 && Double.compare(z, point3D.z) == 0;
        return x == point3D.x && y == point3D.y && z == point3D.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D();
        System.out.print("Введите координаты 1й точки: ");
        p1.Set_X(in.nextDouble());
        p1.Set_Y(in.nextDouble());
        p1.Set_Z(in.nextDouble());
        System.out.print("Введите координаты 2й точки: ");
        p2.Set_X(in.nextDouble());
        p2.Set_Y(in.nextDouble());
        p2.Set_Z(in.nextDouble());
        p1.Show();
        p2.Show();
        if(p1.equals(p2)) System.out.println("Точка равна сама себе");
    }

}
