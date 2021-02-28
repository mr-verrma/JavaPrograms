package Java;

import java.util.Scanner;

public class AllPrimeNumber {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int low = scn.nextInt();
    int high = scn.nextInt();
    
    for(int num = low;num<=high;num++){
        int div;
        for( div = 2;div*div<=num;div++){
            if(num % div ==0){
                break;
            }
        }
        if(div*div > num){
            System.out.println(num);
        }
    }
  }
}
