import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int taxA, taxB;
        int ans = -1;
        
        for (int i = 1000; i >= 12; i--) {
            taxA = (int) (i * 0.08);
            taxB = (int) (i * 0.10);
//            pw.println(i + " " + taxA + " " + taxB);
            if (a == taxA && b == taxB)   ans = i;
        }
        pw.println(ans);
        
        pw.flush();
    }
}