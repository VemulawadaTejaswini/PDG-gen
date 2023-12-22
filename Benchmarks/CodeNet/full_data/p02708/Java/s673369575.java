import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        String[] inputs = br.readLine().split(" ");
        type = Integer.parseInt(inputs[0]);
        int min = Integer.parseInt(inputs[1]);

        sum = new long[type+2];
        bottom = new long[type+2];
        top = new long[type+2];
        for(int i = 0; i <= type + 1; i++) {
            sum[i] = -1;
            bottom[i] = -1;
            top[i] = -1;
        }
        
        long ans = 0;
        bottom[min] = 0;
        for(int i = 0; i < min; i++) {
            bottom[min] += i;
        }
        top[min] = 0;
        for(int i = 0; i < min; i++) {
            top[min] += type - i;
        }

        for(int i = min; i <= type + 1; i++) {
            ans = modAdd(ans, sum(i));
        }

        pw.println(ans);
        pw.flush();
    }
    static long modAdd(long x, long y) {
        return (x + y) % 1000000007;
    }

    // num個選んだ時の合計の種類
    static long sum(int num) {
        if(num == 1) {
            sum[1] = type + 1;
            return sum[1];
        }
        if(sum[num] != -1) return sum[num];

        sum[num] = top(num) - bottom(num) + 1;
        return sum[num];
    }

    static long top(int num){
        if(num == 1) {
            top[1] = type;
            return top[1];
        }
        if(top[num] != -1) return top[num];
        top[num] = top(num-1) + type - num + 1;
        return top[num];
    }
    static long bottom(int num){
        if(num == 1) {
            bottom[1] = 0;
            return bottom[1];
        }
        if(bottom[num] != -1) return bottom[num];
        bottom[num] = bottom(num-1) + num - 1;
        return bottom[num];
    }

    static int type;
    static long sum[];
    static long bottom[];
    static long top[];
}