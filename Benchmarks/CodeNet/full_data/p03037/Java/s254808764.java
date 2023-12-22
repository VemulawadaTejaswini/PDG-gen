
import java.util.*;

public class Main {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();;

        int[] arr = new int[n+1];

        for(int i = 0;i < m;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            for(int j = l;j <= r;j++){
                arr[j]++;
            }
        }

        int ans = 0;
        for(int i = 1;i <= n;i++){
            if(arr[i] == m){
                ans++;
            }
        }
        System.out.println(ans);
    }
}