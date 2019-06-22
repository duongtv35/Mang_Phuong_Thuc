package Day2;

import java.util.Scanner;

public class delete_element_in_array {

    public static void main(String[] args) {
        creat_array();


    }

    public static void creat_array() {
        int[] Ns = {1, 2, 3, 4, 5};


        int[] Ns1 = new int[4];
        for (int i = 0; i < 2; i++) {
            Ns1[i] = Ns[i];


        }
        for(int i=2;i<4;i++){
            Ns1[i] = Ns[i+1];

        }
        for (int i = 0; i <4 ; i++) {
            System.out.println(Ns1[i]);

        }
    }
}
