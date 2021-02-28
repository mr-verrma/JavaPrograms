package Java;

import java.util.Scanner;

public class Inverse_A_number {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt(); //1234

        int inv = 0 ;
        int op = 1; 
        while(n!=0){ 
            int od = n% 10; //4
            int id = op ;   //0
            int ip = od ;  //4

            inv  = inv + id * (int) Math.pow(10,ip - 1); //4000 
            n= n / 10 ;
            op ++;
        }
        System.out.println(inv);

    }
}
