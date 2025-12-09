import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 3 Веществен.числа: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();
        double proiz, sred;
        proiz = num1 * num2 * num3;
        sred = (num1 + num2 + num3)/3;

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