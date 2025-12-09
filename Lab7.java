import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        System.out.print("Введите точность: ");
        double accurate = in.nextDouble();
        double step = 1, exp = 1, fact = 1;
        while (Math.abs(step) >= accurate) {
            step *= x / fact;
            exp += step;
            fact++;
        }
        System.out.printf("exp(%f) = ", x);
        System.out.println(exp + "\n");
        System.out.println(Math.exp(x));
    }
}