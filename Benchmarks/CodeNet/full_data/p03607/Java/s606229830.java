import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int prev = arr[0];
        int cnt = 1;
        int ans = 0;
        for(int i = 1; i < n; i++){
            if(prev == arr[i]){
                cnt++;
            }else{
                if(cnt % 2 != 0) ans++;
                prev = arr[i];
                cnt = 1;
            }
        }
        System.out.println(cnt % 2 == 0 ? ans : ans+1);
    }
}
