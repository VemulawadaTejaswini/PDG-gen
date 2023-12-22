import java.io.*;
import java.util.*;

public class Main{
  
 public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        int len = S.length();
        boolean same = false;
        OUTER: for(int i = 0; i < len;i++){//roations
            same = true;
            for(int j = 0; j <len;j++){
                if(S.charAt((i+j)%len) != T.charAt(j)){
                    same = false; 
                    break;
                }

            }
            if(same)break;

        }


        System.out.println(same?"Yes":"No");
    } 
  
  
  
  
  
}