
package collagewallah;

import java.util.Scanner;

public class MazePath2 {
    public static int maze(int r, int c){
        int up = 0;
        int left = 0;
       if(r==1 && c==1){
           return 1;
       } 
       if(c != 1 & r != 1){
           up += maze(r-1,c);
           left += maze(r,c-1);
       }else if( r ==1 ){
           left += maze(r,c-1);
           
       }else if( c == 1){
           up += maze(r-1,c);
           
       }
       int totalways = up + left;
       return totalways;
      
    }
    public static void main(String[] args) {
        int n,m;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of rows of the maze2: ");
        n = input.nextInt();
        System.out.print("Enter no of column of the maze2: ");
        m = input.nextInt();
        int noOfWays = maze(n,m);
        System.out.println(noOfWays+" no of ways");
    }
}
