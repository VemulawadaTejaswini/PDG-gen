import java.awt.*;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.List;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = nextInt();

        int[] A = new int[N];
        int[] B = new int[N-1];
        for(int i=0; i<N-1; i++){
            B[i] = nextInt();
        }

        int count = 0;
        A[0] = B[0];
        count += A[0];
        A[N-1] = B[N-2];
        count += A[N-1];
        int min = B[0];
        for(int i=1; i<N-1; i++){
            min = Math.min(B[i-1], B[i]);
            A[i] = min;
            count += A[i];
        }

        println(count);
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
