package Day2;

import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        gopmang();
    }

    public static void gopmang() {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[2];
        System.out.println("enter array1");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("enter array2");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }
        int size = array1.length + array2.length;
        int[] array = new int[size];

        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        for (int i = array1.length; i < size; i++) {
            array[i] = array2[i - array1.length];
        }
        for (int x:array) {
            System.out.println(x + " ");
        }
    }
}
