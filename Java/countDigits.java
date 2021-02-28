package Java;
import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int noOfDigits = 0;
        while(n != 0){
            n=n/10;
            noOfDigits++;
        }
        System.out.println(noOfDigits);
    }
}
