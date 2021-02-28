package Java;
import java.util.Scanner;

public class rotate_a_Number {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int k =s.nextInt();

        int temp = n;
        int noOfDig = 0;
        while(temp != 0){
            temp = temp / 10;
            noOfDig++;
        }
        k= k % noOfDig ; //greater than no of digits
        if(k < 0){
            k = k + noOfDig;
        }

        int div = 1 ;
        int multi = 1;
        for(int i = 1; i <= noOfDig; i++){
            if(i <= k){
                div = div* 10;
            }
            else{
                multi = multi * 10;
            }
        }
        int q = n / div ;
        int r = n % div ;
        int rotate = r*multi +q;
        System.out.print(rotate);

}
}