package Day2;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        ConverFtoC();
    }
    public static void ConverFtoC(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter F");
        double F = scanner.nextDouble();
        double C = (5.0/9)*(F-32);

        System.out.println("C is" +C);
    }
}
