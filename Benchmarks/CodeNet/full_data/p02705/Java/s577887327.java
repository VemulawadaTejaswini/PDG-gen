import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        DecimalFormat df = new DecimalFormat("0.00000000");
        final int R = Integer.parseInt(sc.next());
        double ans = 2.0 * R * Math.PI;
        out.println(df.format(ans));
        
        out.flush();
    }
}