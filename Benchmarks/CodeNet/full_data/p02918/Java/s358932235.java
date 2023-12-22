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
        int K = nextInt();
        char[] S = next().toCharArray();

        int count = 0;
        boolean flag = false;
        for(int i=1; i<N; i++){
            if(flag && S[i-1] == S[i]){
                flag = false;
                if(count >= K) break;
            }
            if(flag && S[i-1] != S[i]){
                S[i] = S[i-1];
            }
            if(!flag && S[i-1] != S[i]){
                S[i] = S[i-1];
                flag = true;
                count++;
            }
        }

        int ans = 0;
        for(int i=0; i<N-1; i++){
            if(S[i] == S[i+1]) ans++;
        }

        println(ans);
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
