import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sum = new int[n];
        int ans = 0;
        sum[0] = sc.nextInt();
        for(int i = 1; i < n; i++){
            int a = sc.nextInt();
            sum[i] = sum[i-1] + a;
            if(sum[i-1] < 0 && sum[i] <= 0){
                ans += -sum[i] + 1;
                sum[i] += ans;
            }else if(sum[i-1] > 0 && sum[i] >= 0){
                ans += sum[i] + 1;
                sum[i] -= ans;
            }
        }
        System.out.println(ans);
    }
}