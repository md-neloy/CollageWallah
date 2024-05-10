
package collagewallah;

public class CallStack {
    static void fact(int n){
        if(n == 0)
            return;
        System.out.println("pre: "+n);
        fact(n-1);
        System.out.println("In: "+n);
        fact(n-1);
        System.out.println("Post: "+n);
        return ;
    }
    public static void main(String[] args) {
        fact(2);
    }
}
