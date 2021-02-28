package Java;
import java.util.Scanner;
public class substring{

    public static boolean  isContain(String ss){
        int i=0;
        int j = ss.length();
        while(i <=j){
            char ch = 'b';
                if( ss.charAt(i) !=ch){
                    return false;
            
                }else{
                    i++;
                    j--;
                }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int count=0;
        
        for(int i = 0 ; i <str.length(); i++){
            for(int j = i+1; j<=str.length();j++){
                String ss = str.substring(i, j);
                 System.out.println(ss);
                  if(isContain(ss) ==true){
                      count++;
                  }
            //    if(isContain(ss)== true){
            //        
            //    }            
               }
           
            }
            System.out.println(count);
            }
            
        }


