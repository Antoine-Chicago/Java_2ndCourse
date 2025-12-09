import java.util.Scanner;
import java.util.Objects;
class Vector3DProcessor {
    private double x,y,z;

    public static Vector3D VectorSum(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.Get_X() + v2.Get_X(),v1.Get_Y() + v2.Get_Y(),v1.Get_Z() + v2.Get_Z());
    }

    public static Vector3D VectorDif(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.Get_X() - v2.Get_X(),v1.Get_Y() - v2.Get_Y(),v1.Get_Z() - v2.Get_Z());
    }

    public static double VectorScalyr(Vector3D v1, Vector3D v2){
        return v1.Get_X() * v2.Get_X() + v1.Get_Y() * v2.Get_Y() + v1.Get_Z() * v2.Get_Z();
    }

    public static Vector3D VectorProiz(Vector3D a, Vector3D b){
        return new Vector3D(a.Get_Y()*b.Get_Z() - a.Get_Z()* b.Get_Y(),a.Get_Z()*b.Get_X() - b.Get_Z()* a.Get_X(), b.Get_Y()*a.Get_X() - b.Get_X()*a.Get_Y());
    }

    public static boolean Collinear(Vector3D v1, Vector3D v2) {
        return Objects.equals(VectorProiz(v1, v2), new Vector3D());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3DProcessor that = (Vector3DProcessor) o;
        return Double.compare(x, that.x) == 0 && Double.compare(y, that.y) == 0 && Double.compare(z, that.z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    public void Set_X(double x) {this.x = x;}
    public void Set_Y(double y) {this.y = y;}
    public void Set_Z(double z) {this.z = z;}

    public double Get_X() {return x;}
    public double Get_Y() {return y;}
    public double Get_Z() {return z;}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector3D v1 = new Vector3D();
        Vector3D v2 = new Vector3D();
        System.out.print("Введите координаты 1 вектора: ");
        v1.Set_X(in.nextDouble());
        v1.Set_Y(in.nextDouble());
        v1.Set_Z(in.nextDouble());
        System.out.print("Введите координаты 2 вектора: ");
        v2.Set_X(in.nextDouble());
        v2.Set_Y(in.nextDouble());
        v2.Set_Z(in.nextDouble());
        System.out.println("Cумма векторов = " + VectorSum(v1,v2) + "\nРазность векторов = " + VectorDif(v1,v2));
        System.out.println("Скаляр. произв-е = " + VectorScalyr(v1,v2));
        System.out.println("Вектор. произвед-е = " + VectorProiz(v1,v2));
        if(Collinear(v1,v2)) System.out.println("Векторы коллинеарны");
        else System.out.println("Векторы не коллинеарны");

    }
}
