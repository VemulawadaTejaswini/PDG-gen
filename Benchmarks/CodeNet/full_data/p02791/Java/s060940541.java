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
        ArrayList<Integer> P = new ArrayList<>();
        for(int i=0; i<N; i++){
            P.add(nextInt());
        }
        int count = 0;
        List<Integer> a;
        for(int j=0; j<N; j++){
            if(j == 0){
                count++;
                continue;
            }
            a = P.subList(0, j);
            Collections.sort(a);
            if(a.get(0) < P.get(j)){

            }else{
                count++;
            }
            //println(a.get(a.size()-1) + "," + P.get(j));
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
