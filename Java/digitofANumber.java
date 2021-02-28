package Java;

import java.util.Scanner;

public class digitofANumber {
    public static void main(String[] args) {
        
        Scanner s =new Scanner(System.in);
        int num = s.nextInt();

        int digit = 0;
        int temp = num;
        while(temp!=0){
            temp = temp / 10 ;
            digit++;
        }
        int div= (int)Math.pow(10, digit-1);
        while(div != 0 ){
            int q = num / div ; 
            System.out.println(q);
            num = num % div;
            div = div / 10;
        }
    }
}
