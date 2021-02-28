// 5
// * * * * *
// * * * *
// * * *
// * *
// *

package Patterns;
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int star = n;
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=star;j++){
                System.out.print('*'+" ");
                
            }
            star--;
            System.out.println();
        }
    }
}
