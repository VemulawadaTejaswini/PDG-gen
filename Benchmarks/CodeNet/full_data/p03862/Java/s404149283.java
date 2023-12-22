import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
            
        int cnt = 0;
        int diff = 0;
        for(int i = 1; i < n; i+=2) {
            if(i == n - 1) {
                    cnt += Math.max(0, arr[i] + arr[i-1] - x);
                continue;
            }
                
            diff = arr[i] + arr[i-1] - x;
            if(diff > 0) {
                if(diff <= arr[i])
                    arr[i] -= diff;
                else {
                    arr[i] = 0;
                    arr[i-1] = diff - arr[i];
                    
                }
                cnt += diff;
            }
            
            diff = arr[i] + arr[i+1] - x;
            if(diff > 0) {
                if(diff <= arr[i])
                    arr[i] -= diff;
                else {
                    arr[i] = 0;
                    arr[i+1] = diff - arr[i];
                }
                cnt += diff;
            }
        }
        
        System.out.println(cnt);
    }
}
