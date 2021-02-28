package Java;
import java.util.Scanner;

public class inverseOfNumber {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    
    int inv = 0;
    int originalPlace = 1;
    while(n!=0){
        int originalDigit = n% 10;
        int invertedDigit = originalPlace;
        int invertedPlace = originalDigit; 
     
     
        inv = inv + invertedDigit * (int)Math.pow(10,invertedPlace-1);
        n = n/10;
        originalPlace++;
    }
    System.out.println(inv);
    }
}
