import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] high;
        int[] low = new int[n / 2];
        if (n % 2 == 0) {
            high = new int[n / 2];
        } else {
            high = new int[(n / 2) + 1];
        }
        for(int i = 0;i < n / 2;i ++){
            low[i] = a[i];
        }
        int j = 0;
        for(int i = n / 2;i < n;i ++){
            high[j] = a[i];
            j ++;
        }
        int[] answer = new int[n];
        answer[0] = high[0];
        if(n % 2 == 0){
            int k = 1;
            //奇数番目にlowを入れる
            for(int i = 0;i < n / 2;i ++){
                answer[k] = low[i];
                k += 2;
            }
            //偶数番目にhigh
            k = 2;
            for(int i = 1;i < n / 2;i ++){
                answer[k] = high[(n / 2) - i];
                k += 2;
            }
        }else{
            //問題あり
            int k = 2;
            //偶数番目にlowを入れる
            for(int i = 0;i < n / 2;i ++){
                answer[k] = low[i];
                k += 2;
            }
            //奇数番目にhigh
            k = 1;
            for(int i = 1;i < (n / 2) + 1;i ++){
            answer[k] = high[(n / 2) + 1 - i];
            k += 2;
            }
        }
        double ans = 0;
        for(int i = 0;i < n - 1;i ++){
            int sa = Math.abs(answer[i + 1] - answer[i]);
            ans += sa;
            //System.out.println(answer[i]);
        }
        //System.out.println(answer[n - 1]);
        if(n % 2 == 0){
            int k = 1;
            //奇数番目にlowを入れる
            for(int i = 0;i < n / 2;i ++){
                answer[k] = low[i];
                k += 2;
            }
            //偶数番目にhigh
            k = 2;
            for(int i = 1;i < n / 2;i ++){
                answer[k] = high[(n / 2) - i];
                k += 2;
            }
        }else{
            //問題あり
            int k = 1;
            //奇数番目にlowを入れる
            for(int i = 0;i < n / 2;i ++){
                answer[k] = low[i];
                k += 2;
            }
            //偶数番目にhigh
            k = 2;
            for(int i = 1;i < (n / 2) + 1;i ++){
            answer[k] = high[(n / 2) + 1 - i];
            k += 2;
            }
            double tmpans = 0;
            for(int i = 0;i < n - 1;i ++){
                int sa = Math.abs(answer[i + 1] - answer[i]);
                tmpans += sa;
                //System.out.println(answer[i]);
            }
            if(tmpans > ans){
                ans = tmpans;
            }
        }
        System.out.println(Math.round(ans));
    }
}