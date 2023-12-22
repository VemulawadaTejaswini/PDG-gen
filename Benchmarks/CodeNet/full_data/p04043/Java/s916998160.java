import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = sc.next();
        s += sc.next();
        s += sc.next();
        
        out.println(s.equals("575") || s.equals("557") || s.equals("755") ? "YES" : "NO");
        
        out.flush();
    }
}