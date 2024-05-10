
package collagewallah;

import java.util.Scanner;

public class Hanio {
    public static void hino(int n, char s, char h, char d){
        if(n== 0) return;
        hino(n-1,s,d,h);
        System.out.println(s+" - "+d);
        hino(n-1,h,s,d);
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the disk number: ");
        int n = input.nextInt();
        hino(n,'A','B','C');
        
    }
}
