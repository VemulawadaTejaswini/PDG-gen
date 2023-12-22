import javax.print.DocFlavor;
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
        int[] X = new int[N];
        Arrays.setAll(X, i->nextInt());

        int max = -1;
        int min = 101;
        for(int i=0; i<N; i++){
            max = Math.max(max, X[i]);
            min = Math.min(min, X[i]);
        }

        int minSum = 0;
        for(int i=min; i<max; i++){
            int sum = 0;
            for(int j=0; j<N; j++){
                sum += Math.pow(X[j]-i, 2.0);
            }
            if(i == min){
                minSum = sum;
                continue;
            }
            minSum = Math.min(minSum, sum);
        }
        println(minSum);
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
