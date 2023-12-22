import java.util.Scanner;


public class Main {

    
      public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       String S = sc.next();


      boolean flag = true;       
       for(int i = 0 ;i < S.length();i++){
           int count = 0;
           char ch = S.charAt(i);
           for(int j = 0 ;j < S.length();j++){
               if(S.charAt(j) == ch){
                   count++;
               }
           }               
           if(count%2 == 0 ){
                continue;
           }else{
                flag= false;
                break;
           }
       }
       
         if(flag){
             System.out.println("YES");
         }else{
             System.out.println("No");
         }
      
     }
}