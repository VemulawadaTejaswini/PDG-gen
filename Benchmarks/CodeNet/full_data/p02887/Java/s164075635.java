import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final long N = Integer.parseInt(sc.next());
        char[] ch = sc.next().toCharArray();
        char pre = ch[0];
        long ans = 1;
        
        for (int i = 0; i < N; i++) {
            if (pre != ch[i]) {
                pre = ch[i];
                ans++;
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
}