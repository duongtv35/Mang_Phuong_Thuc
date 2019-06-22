package Day2;

import java.util.Random;

public class Exeption {
    public Integer[] creatRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[40];
        System.out.println("list of element on array");
        for (int i = 0; i <40 ; i++) {
            arr[i] = rd.nextInt();

        }
        return arr;
    }



}


