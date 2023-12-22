import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        sc.close();

        StringBuilder sb = new StringBuilder();
        String S1 = S.substring(0, 1);
        sb.append(S1);
        for (int i=1; i<N; i++) {
            if (!S1.equals(S.substring(i, i+1))) {
                S1 = S.substring(i, i+1);
                sb.append(S1);
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(sb.length());
        out.flush();
    }
}