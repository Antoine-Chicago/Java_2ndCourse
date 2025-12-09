import java.util.Scanner;
public class Lab6 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Система урав: ax+by=c && dx+ey=f\nВведите 3 коэффицента для 1 урав-я: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.print("Введите 3 коэффицента для 2 урав-я: ");
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        double A = a * e - d * b;
        double D1 = c * e - f * b;
        double D2 = a * f - d * c;
        if (A != 0) {
            System.out.println("Прямые пересекаются");
            System.out.printf("x = %.3f\n", D1 / A);
            System.out.printf("y = %.3f\n", D2 / A);
        } else if (D1 == 0 && D2 == 0) {
            System.out.println("Существует бесконечное кол-во решений\nПрямые наложены друг на друга");
        } else {
            System.out.println("Здесь нет решений\nПрямые паралелльны");
        }
    } //{0 5 2} {0 6 1}

}