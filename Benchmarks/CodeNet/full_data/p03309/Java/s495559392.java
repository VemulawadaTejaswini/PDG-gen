import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str_as = br.readLine().split(" ");
        long[] as = new long[n];
        //int max = -1;
        //int min = 1000000005;
        for (int i = 0; i < n; i++) {
            as[i] = Long.parseLong(str_as[i]);
        }
        
        long ans = 0;
        long ans1 = 0;
        long ans2 = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(as[i] - (i+1));
        }
        for (int i = 0; i < n; i++) {
            ans1 += Math.abs(as[i] - (i+2));
        }
        for (int i = 0; i < n; i++) {
            ans2 += Math.abs(as[i] - (i));
        }
        
        long answer = 0;
        long temp = 0;
        long min = -1;
        long prev = -1;
        if (ans <= ans1 && ans <= ans2) answer = ans;
        else if (ans1 >= ans2) {
            //System.out.println("aaa");
            for (int b = 0; ; b--) {
                for (int i = 0; i < n; i++) {
                    temp += Math.abs(as[i] - (i+b));
                }
                if (b != 0 && prev < temp) {
                    answer = prev;
                    //System.out.println(b);
                    break;
                }
                prev = temp;
                temp = 0;
            }
        }
        else {
            //System.out.println("bbb");
            for (int b = 2; ; b++) {
                for (int i = 0; i < n; i++) {
                    temp += Math.abs(as[i] - (i+b));
                }
                if (b != 2 && prev < temp) {
                    //System.out.println(b);
                    answer = prev;
                    break;
                }
                prev = temp;
                temp = 0;
            }
        }

        
        System.out.println(answer);
    }
}
