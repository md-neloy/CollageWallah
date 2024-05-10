/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collagewallah;
import java.util.Scanner;
public class MazePath {
    public static int maze(int cr, int cc, int er, int ec){
        int rightways = 0;
        int downways = 0;
        if(cc==ec && cr == er){
            return 1;
        }
        if(cc != ec && cr != er){
            rightways += maze(cr,cc+1,er,ec);
            downways += maze(cr+1,cc,er,ec);
            
        }
        if(cc == ec){
            downways += maze(cr+1,cc,er,ec);
            
        }
        if(cr == er){
            rightways += maze(cr,cc+1,er,ec);
            
        }
      int totalways = rightways + downways;
      return totalways;
      
    }
    public static void main(String[] args) {
        int n,m;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of rows of the maze: ");
        n = input.nextInt();
        System.out.print("Enter no of column of the maze: ");
        m = input.nextInt();
        System.out.println(maze(1,1,n,m)+" no of ways");
    }
}
