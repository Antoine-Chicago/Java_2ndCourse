import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 3 коэффицента: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x1, x2, D;
        int k = 0;
        if (a != 0) {
            D = b * b - 4 * a * c;
            if (D >= 0) {
                x1 = (-b + Math.sqrt(D)) / 2 * a;
                x2 = (-b - Math.sqrt(D)) / 2 * a;
                if (x1 != x2) {
                    k = 2;
                    System.out.println("Кол-во корней: "+ k + "\nКорни: " + x1 + "; " + x2);
                } else {
                    k = 1;
                    System.out.println("Кол-во корней: "+ k + "\nКорень: " + x1);
                }
            } else
                System.out.println("Не имеет R корней");

        } else if (a == 0 && b != 0) {
            x1 = -c / b;
            k = 1;
            System.out.println("Кол-во корней: " + k + "\nКорень: " + x1);
        } else
            System.out.println("Не имеет корней");

    }
}