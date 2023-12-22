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
        int priceA, priceB, taxA, taxB;
        int ans = -1;
        
        priceA = (int) (a / 0.08);
        taxB = (int) (priceA * 0.1);
//        pw.println(priceA + " " + taxB);
        if (b == taxB)   ans = priceA;
        
        priceB = (int) (b / 0.1);
        taxA = (int) (priceB * 0.08);
//        pw.println(priceB + " " + taxA);
        if (a == taxA)   ans = Math.min(ans, priceB);
        
        pw.println(ans);
        
        pw.flush();
    }
}