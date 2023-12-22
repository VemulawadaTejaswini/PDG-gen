import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N, K; {int[] a = in.ii(2); N = a[0]; K = a[1];}
        int[] p = in.ii(N);
        int[] sum = new int[N + 1];
        for(int i = 0; i < N; i++){
            sum[i + 1] = sum[i] + p[i];
        }

        int ans = 0;
        for(int i = 0, M = N - K + 1; i < M; i++){
            ans = Math.max(sum[i + K] - sum[i] + K, ans);
        }
        out.println(ans / 2.0);
    }


    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        int[] ii(final int N) {
            int[] a = new int[N];
            int i = 0;
            String s = s();
            for (int j = 0; j < a.length; j++) {
                boolean minus = s.charAt(i) == '-';
                i += minus ? 1 : 0;

                int k = 0;
                while (true) {
                    try {
                        int h = s.charAt(i++) - '0';
                        if (h < 0 || 9 < h) {
                            break;
                        }
                        k = 10 * k + h;
                    } catch (Exception e) {
                        break;
                    }
                }
                a[j] = minus ? -k : k;
            }
            return a;
        }
    }
}
