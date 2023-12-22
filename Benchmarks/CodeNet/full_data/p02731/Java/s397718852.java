import java.text.DecimalFormat;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");
        DecimalFormat df = new DecimalFormat("0.00000000");
        
        int L = Integer.parseInt(sc.next());
        double d = (double) L/3.0;
        double ans = d*d*d;
        pw.println(df.format(ans));
        
        pw.flush();
    }
}