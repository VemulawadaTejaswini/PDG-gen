import java.util.*;

public class Frog1{

     public static void main(String []args){
        
        Scanner  s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i < n;++i){
            arr[i] = s.nextInt();
        }
        
        long ans = 0;
        
        for(int i = 0;i + 1 < n;){
            if(i+2 < n){
                ans += Math.min( Math.abs(arr[i] - arr[i+1]) , Math.abs(arr[i] - arr[i+2]));
                if(Math.abs(arr[i] - arr[i+1]) < Math.abs(arr[i] - arr[i+2]))
                    i++;
                else i += 2;
            }
            else {
                ans += Math.min( Math.abs(arr[i] - arr[i+1]) , Integer.MAX_VALUE);
                i++;
            }
            
            
        }
        
        long ans2 = 0;
        
        for(int i = n - 1;i - 1 >= 0;){
            
            if(i - 2 >= 0){
                ans2 += Math.min( Math.abs(arr[i] - arr[i-1]) , Math.abs(arr[i] - arr[i-2]));
                if(Math.abs(arr[i] - arr[i-1]) < Math.abs(arr[i] - arr[i-2]))
                    i--;
                else i -= 2;
            }
            else {
                ans2 += Math.min( Math.abs(arr[i] - arr[i-1]) , Integer.MAX_VALUE);
                i--;
            }
            
        }
        System.out.println(Math.min(ans , ans2));
        
        
        
        
        
        
     }
}