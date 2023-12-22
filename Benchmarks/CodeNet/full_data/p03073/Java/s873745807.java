import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        char[] ch = sc.next().toCharArray();
        final int N = ch.length;
        char[] ar = new char[N];
        char[] br = new char[N];
        int a = 0;
        int b = 0;
        for (int i = 0; i < N; i++) {
            ar[i] = i % 2 == 0 ? '0' : '1'; 
            br[i] = i % 2 == 0 ? '1' : '0';
        }
        
        for (int i = 0; i < N; i++) {
            if (ch[i] != ar[i]) {
                a++;
            } else {
                b++;
            }
        }
        
        out.println(Math.min(a, b));
        
        out.flush();
    }
}