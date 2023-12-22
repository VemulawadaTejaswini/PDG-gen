import java.io.PrintWriter;
import java.util.*;
//https://qiita.com/p_shiki37/items/3902f4e3adc3aeb382f1

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = Integer.parseInt(sc.next());
        sc.close();

        long count = 0;
        boolean sb = false;
        if (S.charAt(0) == S.charAt(S.length() - 1)) {
            sb = true;
        }
        boolean sf = false;
        for (int i=0; i<S.length()-2; i++) {
            if (S.charAt(i) != S.charAt(i+1)) {
                sf = false;
            } else {
                if (sf) {
                    sf = false;
                } else {
                    sf = true;
                    count++;
                }
            }
        }
        if (!sf && sb)
            count++;
        PrintWriter out = new PrintWriter(System.out);
        out.println(K * count);
        out.flush();
    }
}