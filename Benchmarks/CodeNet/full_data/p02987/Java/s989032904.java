import java.io.PrintWriter;
import java.util.*;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args){
        String str = sc.next();

        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(str.split("")));

        println(set.size() == 2 ? "Yes" : "No");
    }

    static int nextInt(){
        return Integer.parseInt(sc.next());
    }
    static Long nextLong(){
        return Long.parseLong(sc.next());
    }
    static void println(Object o){
        PrintWriter out = new PrintWriter(System.out);
        out.println(o);
        out.flush();
    }
   static void print(Object o){
       PrintWriter out = new PrintWriter(System.out);
       out.print(o);
       out.flush();
    }
}
