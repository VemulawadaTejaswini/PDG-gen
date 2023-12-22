import java.util.*;

public class Main {    
    
   public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);
    
       String S = sc.next();
       
       char a[] = new char[25];
       
       for(int i = 0;i < S.length();i++){
           a[S.charAt(i) - 'a']++;
       }
       
       for(int i = 0;i < 25;i++){
           if(a[i]%2 != 0){
               System.out.println("NO");
               return;
           }
       }
       
       System.out.println("YES");
    
   }   
}
        
        