import java.util.*;


public class Main{
    public static void main(String[] args){            
       
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        
        int count = 0;
        for(int i = 0 ;i < S.length()-1;i++){
           char one = S.charAt(i);
           char two = S.charAt(i+1);
           if(one != two){
               count++;
           }else{
               continue;
           }           
        }
        
        System.out.println(count);        
        
        
    }                                       
}