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
        int A = nextInt();
        int B = nextInt();

        if(A == 1){
            if(B == 3){
                println(2);
                return;
            }else{
                println(3);
                return;
            }
        }else if(A == 2){
            if(B == 1){
                println(3);
                return;
            }else{
                println(1);
                return;
            }
        }else{
            if(B == 1){
                println(2);
                return;
            }else{
                println(1);
                return;
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
