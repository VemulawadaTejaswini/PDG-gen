import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = nextInt();
        long K = nextLong();

        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = nextInt();
        }

        long count = 0;
        for(int i=0; i<N-1; i++){
            int before = A[i];
            for(int j=i+1; j<N; j++) {
                if(before > A[j]) count++;
            }
        }

        int[] A2 = new int[(int)2*N];
        for(int i=0; i<2*N; i++){
            A2[i] = A[i%N];
        }

        long count2 = 0;
        for(int i=0; i<N; i++){
            int before = A2[i];
            for(int j=i+1; j<2*N; j++) {
                if(before > A2[j]) count2++;
            }
        }

        long t = 0;
        for(int i=0; i<K;i++){
            t += count+(count2-count)*i;
            t %= 1000000007L;
        }

        long sum = K*(2*A[0]+(K-1)*(count2-count));
        println(t);
    }

    //最小公倍数lcm
    static long lcm (long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (c/b);
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static Long nextLong() {
        return Long.parseLong(next());
    }

    static String next() {
        return sc.next();
    }

    static String nextLine(){
        return sc.nextLine();
    }

    static void println(Object o) {
        out.println(o);
        out.flush();
    }

    static void print(Object o) {
        PrintWriter out = new PrintWriter(System.out);
        out.print(o);
        out.flush();
    }
}
