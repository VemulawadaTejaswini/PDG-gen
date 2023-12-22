import java.util.*;
import java.util.Arrays;

public class Main {// Main
    public static void main(String[] args){

        Scanner sc =   new Scanner(System.in);
        String S = sc.next();

         if (S.startsWith("k")) {
             if(S.endWith("eyence")){
                System.out.println("YES");
                
             }
        } else
         if (S.startsWith("ke")) {
             if(S.endWith("yence")){
                System.out.println("YES");
             }
        } else
         if (S.startsWith("key")) {
             if(S.endWith("ence")){
                System.out.println("YES");
             }
        } else
         if (S.startsWith("keye")) {
             if(S.endWith("nce")){
                System.out.println("YES");
             }
        } else
         if (S.startsWith("keyen")) {
             if(S.endWith("ce")){
                System.out.println("YES");
             }
        } else
         if (S.startsWith("keyenc")) {
             if(S.endWith("e")){
                System.out.println("YES");
             }
        } else
         if (S.startsWith("keyence")) {
             
                System.out.println("YES");
             
        } else 
        if ( S.endWith("keyence")) {
                System.out.println("YES");
        } else if(true==true){
            System.out.println("NO");
        }
    }    
}