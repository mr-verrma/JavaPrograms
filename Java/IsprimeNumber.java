package Java;
import java.util.Scanner;

public class IsprimeNumber{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=0;i<n;i++){
            int t= scn.nextInt(); //5

            int count =0;
            for(int div =2;div*div<=t;div++){ 
                if(t% div ==0){
                    count++;
                    break;
                }
            }
             if(count == 0){
            System.out.println("prime ");
        }
        else{
            System.out.println("not prime");
        }
        }
       
    }
}