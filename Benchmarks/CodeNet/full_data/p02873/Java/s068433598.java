import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        sc.close();

        int v[] = new int[S.length()+1];
        char c[] = S.toCharArray();

        int d = 0;
        for (int i=0; i<S.length(); i++) {
            if (c[i]=='<') {
                v[i] = d;
                d++;
                v[i+1] = d;
            } else {
                d = 0;
            }
        }
        d = 0;
        for (int i=S.length()-1; i>=0; i--) {
            if (c[i]=='>') {
                v[i+1] = d;
                d++;
                if (v[i]<=d) {
                    v[i] = d;
                }
            } else {
                d = 0;
            }
        }

        long sum = Arrays.stream(v).sum();
        PrintWriter out = new PrintWriter(System.out);
        out.println(sum);
        out.flush();
    }
}