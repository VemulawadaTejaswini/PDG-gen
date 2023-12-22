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
        Map<String, Integer> map = new TreeMap<>();

        int max = 0;
        for(int i=0; i<N; i++){
            String S = next();
            if(map.containsKey(S)){
                map.put(S, map.get(S)+1);
            }else{
                map.put(S, 1);
            }
            max = Math.max(max, map.get(S));
        }

        for(String key : map.keySet()){
            if(map.get(key) == max){
                println(key);
            }
        }
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
