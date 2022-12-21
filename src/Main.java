import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("задание 1");
        int[] num = new int [3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        System.out.println(num[2]);

        double[] num2 = {1.57, 7.654, 9.986};

        int[] mas = new int[14];
        mas[4] = 25;
        System.out.println(mas[3]);

        //task2
        System.out.println("задание 2");
        for (int index = 0; index < num.length; index++) {
            if (index == num.length - 1) {
                System.out.println(num[index]);
                break;
            }
            System.out.print(num[index] + ", ");
        }

        for (int index = 0; index < num2.length; index++) {
            if (index == num2.length - 1) {
                System.out.println(num2[index]);
                break;
            }
            System.out.print(num2[index] + ", ");
        }
        for (int index = 0; index < mas.length; index++) {
            if (index == mas.length - 1) {
                System.out.println(mas[index]);
                break;
            }
            System.out.print(mas[index] + ", ");
        }
        //task3
        System.out.println("задание 3");
        for (int index = num.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(num[index]);
                break;
            }
            System.out.print(num[index] + ", ");
        }

        for (int index = num2.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(num2[index]);
                break;
            }
            System.out.print(num2[index] + ", ");
        }

        for (int index = mas.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(mas[index]);
                break;
            }
            System.out.print(mas[index] + ", ");
        }
        //task4
        System.out.println("задание 4");
        int[] num3 = {1, 2, 3};

        for (int i = 0; i < num3.length; i++) {
            if (num3[i] % 2 != 0) {
                num3[i] = num3[i] + 1;
            }
        }
        System.out.println(Arrays.toString(num3));
    }
}