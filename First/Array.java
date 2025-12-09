import java.util.Scanner;
public class Array {

    public static void ShowArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ячейка " + i + " = " + arr[i]); //разбор
        }
    }

    public static void InputArray(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Ячейка " + i + ": ");
            arr[i] = in.nextInt();
        }
    }

    public static int Sum(int[] arr) {
        int i, sum = 0;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int Even(int[] arr) {
        int i, k = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                k++;
            }
        }
        return k;
    }

    public static int Way(int[] arr, int a, int b) {
        int i, k = 0;
        for (i = 0; i <= arr.length; i++) {
            if (a <= i && i <= b) {
                k++;
            }
        }
        return k;
    }

    public static int Pol(int[] arr) {
        int i, p = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                p++;
            }
        }
        return p;
    }

    public static void ReverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        while (size <= 0) {
            System.out.print("Ошибка ввода\nПопробуйте заново: ");
            size = in.nextInt();
        }
        int[] arr = new int[size];
        int num = 0, a = 0, b = 0;
        while (num != 8) {
            System.out.println("МЕНЮ\n1.Ввод эл-ов вручную\n2.Вывод массива\n3.Сумма всех эл-ов\n4.Кол-во четн.чисел\n5.Кол-во эл-ов на отрезке");
            System.out.println("6.Проверка положит-ти\n7.Обратный порядок\n8.ВЫХОД");
            System.out.print("Введите № команды: ");
            num = in.nextInt();

            if (num == 1) {
                InputArray(arr);
            }
            if (num == 2) {
                ShowArray(arr);
            }
            if (num == 3) {
                System.out.println("Сумма = " + Sum(arr));
            }
            if (num == 4) {
                System.out.println("Колво четных = " + Even(arr));
            }
            if (num == 5) {

                System.out.print("Введите знач-я начала и конца отрезка [a,b]: ");
                a = in.nextInt();
                b = in.nextInt();
                while (a > b) {
                    System.out.print("Ошибка ввода\nПопробуйте заново: ");
                    a = in.nextInt();
                    b = in.nextInt();
                }
                System.out.println("Колво эл-ов " + Way(arr, a, b));
            }
            if (num == 6) {

                if (Pol(arr) > 0) {
                    System.out.println("Не все элементы положительны");
                } else {
                    System.out.println("Все элементы положительны");
                }
            }
            if (num == 7) { //уточнение
                ReverseArray(arr);
            }


        }
    }

}

