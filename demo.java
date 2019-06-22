package Day2;

import java.util.Scanner;

public class demo {
    public static int countChar(String str, char ch ){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi ");
        String str = scanner.nextLine();
        System.out.println("Nhap ky tu ");
        String ch = scanner.nextLine();
        char[] chars = ch.toCharArray();
        System.out.println("So lan xuat hien ky tu " + ch + " trong mang la : " + countChar(str,chars[0]));
    }
}
