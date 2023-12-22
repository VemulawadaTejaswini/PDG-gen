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

    static String P = "";
    static String Q = "";
    static int countP = 0;
    static int countQ = 0;
    static boolean isP = false;
    static boolean isQ = false;
    public static void main(String[] args) {
        int N = nextInt();
        int[] P = new int[N];
        for(int i=0; i<N; i++){
            P[i] = nextInt();
        }
        int count = 0;
        for(int j=0; j<N; j++){
            boolean flag = false;
            for(int i=0; i<j; i++){
                if(P[i]>=P[j]){

                }else {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                count++;
            }
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
