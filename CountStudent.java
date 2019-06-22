package Day2;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        ListStudent();
    }

    public static void ListStudent() {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter Size");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("please try again ");
            }
        } while (size > 10);
        double[] Marks = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Marks of student" + (i + 1) + " :");
            Marks[i] = scanner.nextDouble();
        }
        int count =0;
        System.out.println("list of student pass the exam");
        for(int j=0;j<size;j++){
            if(Marks[j]>5 && Marks[j]<10){
                System.out.print(Marks[j] +"\t");
                count ++;
            }

        }
        System.out.println("the student pass the exam is: "+ count );
    }
}
