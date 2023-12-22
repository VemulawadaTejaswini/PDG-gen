//package atcoder.AGC_43;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws Exception {

        String s = "10\n" +
                "1111111112";

     //   br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); int N = nin();
        rl(); char[] ca = nca();

        int a[] = new int[N];
        for (int i=0; i<N; ++i) a[i] = ca[i]-48;

        while (N>1) {
            int j1=0, j2=0;
            int _N = N-1;
            while (j2 < _N) {
                int next = Math.abs(a[j2] - a[j2 + 1]);
                if (next == 0) {
                    j2++; N--;
                } else {
                    a[j1] = next;
                    j1++;
                    j2++;
                }
            }
            N--;
        }

        bw.write(Long.toString(N==0 ? 0 : a[0]));
        bw.newLine();
        bw.flush();
    }

    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static void rl() throws Exception{
        st = new StringTokenizer(br.readLine());
    }
    static long nlo(){
        return Long.parseLong(st.nextToken());
    }
    static int nin(){
        return Integer.parseInt(st.nextToken());
    }
    /*private static void te(){
      }*/
    static double ndo(){
        return Double.parseDouble(st.nextToken());
    }
    static char[] nca(){
        return st.nextToken().toCharArray();
    }
    static String nstr(){
        return st.nextToken();
    }
}