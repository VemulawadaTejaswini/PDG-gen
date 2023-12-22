import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.nextLine();
        int Q = Integer.parseInt(s.nextLine());
        List<String> Qs = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            Qs.add(s.nextLine());
        }
        for (String q : Qs) {
            // 反転
            if (Objects.equals(q.charAt(0), '1')) {
                S = new StringBuffer(S).reverse().toString();
                continue;
            }
            // 文字追加
            int F = Integer.parseInt(q.split(" ")[1]);
            String C = q.split(" ")[2];
            if (F == 1) {
                S = C + S;
                continue;
            }
            S = S + C;
        }
        System.out.println(S);
    }
}