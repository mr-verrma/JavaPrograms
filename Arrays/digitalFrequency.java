package Arrays;
import java.util.Scanner;
public class digitalFrequency {

    public static int dFreq(int n, int d){
        int val=0;
        while(n>0){
            int digit = n%10;
            n=n/10;
            if(digit == d){
                val++;
            }
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int d = s.nextInt();

        System.out.print(dFreq(n,d));
    }
}
