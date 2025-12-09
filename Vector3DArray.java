import java.util.Scanner;
import java.util.Objects;

class Vector3DArray {
    private Vector3D[] Array;

    public Vector3DArray(int size) {
        this.Array = new Vector3D[size];
        for (int i=0; i<size; i++) {
            Array[i] = new Vector3D();
        }
    }

    public static Vector3D VectorSum(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.Get_X() + v2.Get_X(),v1.Get_Y() + v2.Get_Y(),v1.Get_Z() + v2.Get_Z());
    }

    public Vector3D VectorArraySum() {
        Vector3D temp = new Vector3D();
        for (Vector3D i : Array) {
            temp = VectorSum(temp, i);
        }
        return temp;
    }

    public void ShowArray() {
        for (int i=0; i<Array.length; i++) {
            System.out.println(Array[i]);
        }
    }

    public int VectorArrayLength() {
        return Array.length;
    }

    public void ChangeElem(int k, Vector3D newVect) {
        Array[k] = newVect;
    }

    public double MaxVectorLength() {
        double max = -1;
        for (Vector3D i : Array) {
            if (i.VectorLength() > max) {
                max = i.VectorLength();
            }
        }
        return max;
    }

    public int VectorInArray(Vector3D vector) {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i].equals(vector)) {
                return i;
            }
        }
        return -1;
    }

    //пункт 7 работать
    public Vector3D LinearCombination(double[] arg) {
        if (arg.length != Array.length) throw new IllegalArgumentException("Ошибка. Длины не равны\n");
        Vector3D temp = new Vector3D();
        for (int i = 0; i < arg.length; i++) {
            temp = VectorSum(temp, new Vector3D(
                    arg[i] * Array[i].Get_X(),
                    arg[i] * Array[i].Get_Y(),
                    arg[i] * Array[i].Get_Z()));
        }
        return temp;
    }

    public Point3D[] PointArray(Point3D P) {
        Point3D[] arr = new Point3D[Array.length];
        for (int i=0; i<Array.length; i++) {
            arr[i] = new Point3D(P.Get_X() + Array[i].Get_X(), P.Get_Y() + Array[i].Get_Y(), P.Get_Z() + Array[i].Get_Z());
        }
        return arr; //проверка конструктора point3D
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector3DArray vector = new Vector3DArray(3);
        vector.ShowArray();
        Vector3D vect = new Vector3D(3, -5,10);
        Vector3D vex = new Vector3D(9, 2,1);
        Vector3D VErr = new Vector3D(1, 1,1);
        double[] LK = {-1, 3, 2};
        double[] LErr = {-3, 10, 4.9, -75.5};
        Point3D App = new Point3D(4, 6, -9);
        Point3D Bpp = new Point3D(-2, 1, 6);
        Vector3D P = new Vector3D(App, Bpp);
        Point3D[] point_arr = new Point3D[3];

        System.out.println("2. Length of array = " + vector.VectorArrayLength());
        vector.ChangeElem(0,vect);
        vector.ChangeElem(2,vex);
        System.out.println();
        vector.ShowArray();
        System.out.println();
        System.out.println("4. Length MAX = " + vector.MaxVectorLength());
        System.out.println("5. Length search row = " + vector.VectorInArray(VErr));
        System.out.println("6. Vector Sum = " + vector.VectorArraySum());
        System.out.println("7. Linear comb = " + vector.LinearCombination(LK));
        //System.out.println(P); проверка work)

        point_arr = vector.PointArray(App);
        System.out.println("Array of points: ");
        for (int i=0; i<point_arr.length; i++) {
            System.out.println(point_arr[i].toString());
        }

    }

    }
