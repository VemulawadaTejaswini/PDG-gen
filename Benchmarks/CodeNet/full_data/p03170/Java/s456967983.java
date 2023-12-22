// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    
    static String dp(int arr[], int n) 
{ 
        boolean dp[] = new boolean[n+1];
     
        
        for(int i =1 ; i<=n;i++) {
            boolean temp = false;
            for (int j =0; j<arr.length ;j++) {
                if(i<arr[j]) {
                    break;
                }
                if(!dp[i-arr[j]]) {
                    dp[i] = true;
                    break;
                }
            }
            
            
        }
        if(dp[n]) {
            return "First";
        }
        else {
            return "Second";
        }
  
}
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
      
           int n = s.nextInt();
            int arr[] = new int[n];
            int k = s.nextInt();
            for (int i = 0 ; i< n  ; i++) {
                arr[i] = s.nextInt();
            }
            
            
        
            
            System.out.println(dp(arr,k));
        
    }
}