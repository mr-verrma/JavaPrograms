// 5
// * * * * *
//   * * * *
//     * * *
//       * *
//         *

package Patterns;
import java.util.Scanner;


public class pattern4{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int star=n;
        int sp = 0;
        for(int i=1 ; i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            star--;
            sp++;
            System.out.println();
        }
    }
}