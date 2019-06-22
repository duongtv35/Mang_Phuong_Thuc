package Day2;

import java.util.Scanner;

public class findMinNumber {
    public static void main(String[] args) {
        System.out.println(findMinNumber());
    }
    public static double findMinNumber(){
        int size;
        Scanner scanner =  new Scanner(System.in);
        do {
            System.out.println("Enter size");
            size= scanner.nextInt();

        }while (size>10);
        double[] Myarray = new double[size];
        for(int i=0;i<size;i++){
            System.out.println("enter Number" +i +" :");
            Myarray[i]= scanner.nextDouble();

        }
        double min = Myarray[0];
        for(int j=1;j<size;j++){
            if(min>Myarray[j]){
                min = Myarray[j];
            }
        }
        return min;
    }

}
