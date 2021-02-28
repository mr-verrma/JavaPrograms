package Arrays;
import java.math.BigDecimal;
import java.util.Scanner;
public class anyBaseToanyBase {

    public static int decimalToanyBase(int n, int base){
        int rv = 0;
        int p = 1;
        while(n>0){
            int digit = n % base;
            n = n / base ;

            rv = rv + digit * p;
            p=p*10;
        }
        return rv;
    }
    public static int baseToanyDecimal(int n,int base){
        int rv = 0;
        int p = 1 ;
        while(n>0){
            int digit = n % 10 ;
            n= n /10;

            rv = rv + digit * p;
            p = p * base ; 
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int base = s.nextInt();
        int base2 =s.nextInt();

      
        int bd = baseToanyDecimal(n,base);
        int dn= decimalToanyBase(bd,base2);
        System.out.println(dn);
    }
}
