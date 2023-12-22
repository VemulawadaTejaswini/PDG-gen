
import java.util.*;

public class Main {    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

      String S = sc.next();        

      String ans = "";
      
      while(true){
        if(S.endsWith("dream") || S.endsWith("erase")){
            S = S.substring(0,S.length() - 5);
        }        
        else if(S.endsWith("dreamer")){
            S = S.substring(0,S.length() - 7);
        }
        else if(S.endsWith("eraser")){
            S = S.substring(0,S.length() - 6);
        }else{
           if(S.length() == 0){
               ans = "YES";
               break;
           }else{
               ans = "NO";
               break;
           }    
        }        
      }
      
       System.out.println(ans);      
      
    }                                      
}
        