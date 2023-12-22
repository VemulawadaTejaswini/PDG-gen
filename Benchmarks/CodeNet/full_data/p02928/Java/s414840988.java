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
        println(count);

        long sum = 0;
        for(long k=K; k>=1; k--){
            sum += count*k%1000000007L;
        }

        long result = sum%(1000000007L);
        println(result);
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
