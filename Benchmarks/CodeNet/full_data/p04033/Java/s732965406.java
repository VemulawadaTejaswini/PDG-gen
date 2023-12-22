import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        String ans = "Positive";
        
        if (a <= 0 && b >= 0) {
            ans = "Zero";
        } else if (a < 0 && (a + b) % 2 == 0) {
            ans = "Negative";
        }

        out.println(ans);
        
        out.flush();
    }
}