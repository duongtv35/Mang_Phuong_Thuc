package Day2;

import java.util.Scanner;

public class ArrangeArray {
    public static void main(String[] args) {
        daonguoc();
    }
    public static void daonguoc(){
        int size;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("please enter size");

            size = scanner.nextInt();

        }while (size>10);
        double[] Numbers = new double[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the Number " +i+ " :");
            Numbers[i] = scanner.nextDouble();
        }
        for(int j=0;j<=Numbers.length/2;j++){
            double temp = Numbers[j];
            Numbers[j] = Numbers[size-1-j];
            Numbers[size-1-j] = temp;


        }
        System.out.println("the array after change is " + Numbers);
    }
}
