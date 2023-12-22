import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int array[] = new int[t + 1];
        st  = new StringTokenizer(br.readLine());
        for(int i = 1;i <= t;i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
        int start = 1;
        int ans[] = new int[k + 1];
        for(int i = t ;i >= 1;i--){
            for(int j = 1;j <= array[i];j++){
                ans[start] = i;
                start += 2;
                if(start > k)start = 2;
            }
        }
        int days = 0;
        for(int i = 2;i <= k;i++){
            if(ans[i] == ans[i - 1])++days;
        }
        if((k & 1) == 0 && array[t] > k/2 && array[t] != k)--days;
        System.out.print(days);
    }
}