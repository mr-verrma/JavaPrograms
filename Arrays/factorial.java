package Arrays;

import java.util.Scanner;

public class factorial {

    public static int factorial(int n){
        int val = 1;
        for(int i=1;i<=n;i++){
            val = val * i;
        }
        
        return val;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r= s.nextInt();

        int nfact = factorial(n);
        System.out.println(nfact);
        int nmrfact = factorial(n-r);
        System.out.println(nmrfact);
        int npr = nfact / nmrfact ;
        System.out.print(npr);
    }
}
