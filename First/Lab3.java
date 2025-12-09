import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 3 ЦЕЛЫХ числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        double sred;
        int proiz;
        proiz = num1 * num2 * num3;
        sred = (num1 + num2 + num3)/3.0;

        System.out.println("Произведение: " + proiz);
        System.out.println("Сред.знач: " + sred);
        if(num3 >= num2 && num1 <= num2){
            System.out.println(num1 +" "+ num2 +" "+ num3);
        }
        else if(num3 <= num2 && num1 <= num3){
            System.out.println(num1 +" "+ num3 +" "+ num2);
        }
        else if(num3 >= num1 && num1 >= num2){
            System.out.println(num2 +" "+ num1 +" "+ num3);
        }
        else if(num3 <= num1 && num3 >= num2){
            System.out.println(num2 +" "+ num3 +" "+ num1);
        }
        else if(num2 >= num1 && num1 >= num3){
            System.out.println(num3 +" "+ num1 +" "+ num2);
        }
        else if(num2 <= num1 && num2 >= num3){
            System.out.println(num3 +" "+ num2 +" "+ num1);
        }
    }
}