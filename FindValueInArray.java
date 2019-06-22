package Day2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        findValue();
    }

    public static void findValue() {
        boolean isExist = false;
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya",
                "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("enter name of student");
        String input_Name = scanner.next();
        for (int i = 0; i < students.length; i++) {
            if (input_Name.equals(students[i])) {
                System.out.println("the position of student " + students[i] + " is :" + (i + 1));
                isExist = true;
                break;
            }
        }
        if (isExist == false) {
            System.out.println("there is no student");
        }
    }
}
