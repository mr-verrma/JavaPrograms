package Arrays;
import java.util.*;

public class decimalToanyBase {

    public static int getValueInBase(int num, int base){
        int rv = 0;
        int p = 1;
        while(num > 0){
            int dig = num % base;
            num = num / base;

            rv = rv + dig * p;
            p = p * 10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int base = s.nextInt();

        System.out.println(getValueInBase(num,base));
    }
}
