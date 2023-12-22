import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        String s = sc.next();
        pw.println(s.equals("AAA") || s.equals("BBB") ? "No" : "Yes");
        
        pw.flush();
    }
}