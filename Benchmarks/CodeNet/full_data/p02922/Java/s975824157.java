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
        int count = 0;
        int sum = 1;
        int temp =a;
        for(int i=0;sum<b;i++){
            sum += a-1;
            count++;
        }
        System.out.println(count);

        
        
    }
   
    
       
    
}