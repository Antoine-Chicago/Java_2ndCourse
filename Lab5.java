import java.util.Scanner;
public class Lab5 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 2 точки табуляции: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        while (b < a ){
            System.out.println("Неверно введены точки\nПопробуйте заново");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
        }
        System.out.print("Введите шаг: ");
        double h = scanner.nextDouble();
        while(h <= 0) {
            System.out.println("Неверно введен шаг\nПопробуйте заново");
            h = scanner.nextDouble();
        }
        double x;
        for(x=a; x<=b; x+=h){
            System.out.printf("Знач-е Х в точке %.2f : %.3f\n", x, Math.sin(x));
        }

    }
}