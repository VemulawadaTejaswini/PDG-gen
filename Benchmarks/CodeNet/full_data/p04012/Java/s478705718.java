import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        char[] ch = sc.next().toCharArray();
        final int N = ch.length;
        int[] ar = new int['z' + 1]; // 'z' == 122
        String ans = "Yes";
        
        for (int i = 0; i < N; i++) {
            int ascii = ch[i];
            ar[ascii]++;
        }
        for (int i = 'a'; i <= 'z'; i++) { // 'a' == 97
           if (ar[i] % 2 != 0)  ans = "No";
        }
        
        out.println(ans);
        
        out.flush();
    }
}