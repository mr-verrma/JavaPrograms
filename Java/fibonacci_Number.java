package Java;
import java.util.Scanner;
 public class fibonacci_Number{
     public static void main(String[] args) {
         Scanner s =new Scanner(System.in);
         int num = s.nextInt();
         int a=0;
         int b=1;

         for(int i=0;i<num;i++){
             System.out.println(a);
             int c=a+b;
             a=b;
             b=c;
         }

     }
 }