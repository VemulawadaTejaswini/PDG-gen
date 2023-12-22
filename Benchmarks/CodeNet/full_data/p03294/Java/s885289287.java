import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str_as = br.readLine().split(" ");
        int[] as = new int[n];
        long m=1;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            as[i] = Integer.parseInt(str_as[i]);
            ans += as[i]-1;
        }
        //Arrays.sort(as);
        /*m -= 1;
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += m%as[i];
        }*/
        System.out.println(ans);
    }
}
