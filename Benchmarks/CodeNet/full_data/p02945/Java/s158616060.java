import java.util.*;
import java.util.Arrays;
public class Main{
    
    public static boolean keta(int k){
        int ans =0;
        while(k>0){
            k /=10;
            ans++;

        }
        if(ans%2==0){
            return false;

        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.max(Math.max(a+b,a-b),a*b));

        
        
    }
   
    
       
    
}