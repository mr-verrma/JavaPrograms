// 5
//                                 *
//                         *       *
//                 *       *       *
//         *       *       *       *
// *       *       *       *       *

package Patterns;
import java.util.Scanner;


public class pattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int spaces = n-1;
        int star = 1;
        for(int i=1;i<=n;i++){
        //     System.out.println(spaces+" ->" +star);
 
        // spaces--;
        // star++;
        // System.out.println();
        for(int j=1 ;j<=spaces;j++){
            System.out.print("\t");
           
        }
        for(int j =1;j<=star;j++){
            System.out.print("*\t");
           
        }
        spaces--;
        star++;
    System.out.println();
    }
       
    }
}

