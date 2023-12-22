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
        int n = sc.nextInt();
        int count =0;
        for(int i=1;i<=n;i++){
            if(keta(i)){
                count++;

            }
        }
        System.out.println(count);

        
        
    }
   
    
       
    
}