

package collagewallah;
import java.util.Scanner;
public class CollageWallah {
    public int pow(int a,int b){
        if( b == 1 ){
           return a;
        }
        int num1 = pow(a,b/2) * pow(a, (int)Math.ceil(b/2.0));
        return num1;
    }
    public static void main(String[] args) {
      CollageWallah clg = new CollageWallah();
        
        System.out.println(clg.pow(2,8));
    }
    
    
}
