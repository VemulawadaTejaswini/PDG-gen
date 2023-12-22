import java.util.*;
import java .io.*;
public class Main {
    static int size;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int array[] = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        int max1 = 0;
        for (int i = 1; i <= n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            max1 = Math.max(max1, array[i]);
        }
        st = new StringTokenizer(br.readLine());
        int cnt[] = new int[n + 1];
        int max = 0;
        for(int i = 1;i <= n;i++){
            cnt[i] = Integer.parseInt(st.nextToken());
            max = Math.max(cnt[i],max);
        }
        if(max != max1){
            System.out.print("0");
            return;
        }
        boolean mark[] = new boolean[n + 1];
        mark[1] = mark[n] = true;
        for(int i = 2;i < n;i++)
            if(array[i] > array[i - 1])mark[i] = true;
        for(int i = n - 1;i >= 1;i--)
            if(cnt[i] > cnt[i + 1])mark[i] = true;
        long ans = 1;
        int mod = 1000_000_000 + 7;
        for(int i = 1;i <= n;i++){
            if(mark[i])continue;
            ans *= Math.min(cnt[i],array[i]);
            ans %= mod;
        }
        System.out.print(ans);
    }
    }
