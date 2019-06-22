package Day2;

import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
        System.out.println("the MaxNumber is " + MaxNumber());
    }
    public  static double MaxNumber(){
        int size;
        Scanner scanner = new Scanner(System.in);



        do {
            System.out.println("Enter size of array");
//            System.out.println("please try again");
            size = scanner.nextInt();
        } while (size>10);
        double[] Numbers = new double[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter a Number "+i+ " :");
            Numbers[i] = scanner.nextDouble();

        }
        double max = Numbers[0];
        for(int j=1;j<size;j++){
            if(max<Numbers[j]){
                max = Numbers[j];

            }

        }
          return max;

    }
}
