package Arrays;
import java.util.*;
public class anyBaseAddition {

    public static int addition(int n1,int n2,int b){
        int rv= 0;
        int carry = 0;
        int p = 1;
        while ( n1> 0 || n2 > 0 || carry > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 =n1 / 10;
            n2 = n2  / 10;
            int sd1d2 = d1 + d2 + carry ;
            carry = sd1d2 / b ;
            sd1d2  = sd1d2 % b ;

            rv = rv + sd1d2 * p ;
            p = p * 10 ;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int b = s.nextInt();

        System.out.println( addition(n1,n2,b));
    }
}
