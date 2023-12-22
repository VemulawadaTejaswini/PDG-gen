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
        String S = next();
        String T = next();
        char[] sc = S.toCharArray();
        char[] tc = T.toCharArray();

        if(S.contains(T)){
            for(int i=0; i<sc.length; i++){
                print(sc[i]=='?' ? "a" : sc[i]);
            }
            return;
        }
        int count = 0;
        boolean flag = false;
        for(int i=sc.length-1; i>=0; i--){
            boolean flag2 = false;
            char c = sc[i];
            for(int j=tc.length-1; j>=tc.length-1-count; j--){
                if(c == tc[j]){
                    count++;
                    flag = true;
                    break;
                }
            }
            if(c == '?'){
                count++;
            } else {
                if(!flag) count = 0;
            }
            if(count == tc.length){
                for(int j=0; j<tc.length; j++){
                    sc[i+j] = tc[j];
                }
                flag = true;
                break;
            }
        }

        if(!flag){
            println("UNRESTORABLE");
            return;
        }
        for(int i=0; i<sc.length; i++){
            print(sc[i]=='?' ? "a" : sc[i]);
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
