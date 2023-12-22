import java.util.*;


public class Main{
           
    public static void main(String[] args){            
        
       Scanner sc = new Scanner(System.in);        
       
       String S = sc.next();
       
       int e = S.length();
       
       while(true){
             
           if(e == 0){
               break;
           }else if(e < 5){
               System.out.println("NO");
               return;
           }
           
           if(S.substring(e-5,e).equals("dream")){
                e -= 5;
           }else if(S.substring(e-5,e).equals("erase")){
                e -= 5;    
           }else if(S.substring(e-7,e).equals("dreamer")){
                e -= 7;
           }else if(S.substring(e-6,e).equals("eraser")){
                e -= 6;
           }else{
               System.out.println("NO");
               return;
           }           
           
       }    
       
       System.out.println("YES");
       
    }      
}