import java.util.*;


public class Main{
           
    public static void main(String[] args){            
        
       Scanner sc = new Scanner(System.in);               
      
       int sx = sc.nextInt();
       int sy = sc.nextInt();
       int tx = sc.nextInt();
       int ty = sc.nextInt();
       
       String S = "";
       
       for(int i = 0;i < tx-sx;i++){
           S += "R";
       }
       
       for(int i = 0 ;i < ty-sy;i++){
           S += "U";
       }
       
       for(int i = 0 ; i < tx-sx;i++){
           S += "L";
       }
       
       for(int i= 0 ;i < ty-sy;i++){
           S += "D";
       }
       
       S += "D";
       
        for(int i = 0;i < tx-sx + 1;i++){
           S += "R";
       }
       
        for(int i = 0 ;i < ty-sy + 1;i++){
           S += "U";
       }
        S += "L";
        S +="U";
        
        for(int i = 0 ; i < tx-sx + 1;i++){
           S += "L";
       }
        
        for(int i= 0 ;i < ty-sy+1;i++){
           S += "D";
       }

        S += "R";
        
        System.out.println(S);
       
    }
                                       
}