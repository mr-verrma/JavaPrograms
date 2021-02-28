package Arrays;

import java.util.Scanner;

public class anyBaseToDecimal {
    public static int getValueInDecimal(int n,int base){
        int rv = 0;
        int p = 1 ; 
        while(n>0){
            int digit = n % 10;
            n = n / 10;
            rv = rv + digit * p;
            p=p * base;
        }
        return rv;
    }
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int base =s.nextInt();
    
    System.out.println(getValueInDecimal(n,base));
    }
}