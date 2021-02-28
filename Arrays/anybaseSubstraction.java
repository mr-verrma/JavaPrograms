package Arrays;
import java.util.*;
public class anybaseSubstraction {
    public static int substraction(int n1, int n2, int base){
        int rv = 0 ;
        int carry = 0 ;
        int p = 1;
        while(n2 > 0){
            int d1 = n1 % 10 ;
            int d2 = n2  % 10 ;
            n1 = n1 / 10;
            n2  = n2 / 10;

            int d = 0;
            d2 = d2 + carry;
            if(d2>=d1){
                carry = 0;
                d = d2 - d1 ;
            }else{
                carry = -1;
                d = d2 + base - d1 ;
            }
            rv = rv + d * p;
            p = p * 10;
        }

        return rv ;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int b = s.nextInt();

        System.out.println( substraction(n1,n2,b));
    }    
}
