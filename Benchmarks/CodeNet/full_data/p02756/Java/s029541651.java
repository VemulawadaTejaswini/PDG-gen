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
        StringBuilder sb = new StringBuilder(S);
        for (String q : Qs) {
            // 反転
            if (Objects.equals(q.charAt(0), '1')) {
                sb = sb.reverse();
                continue;
            }
            // 文字追加
            String[] q2 = q.split(" ");
            int F = Integer.parseInt(q2[1]);
            String C = q2[2];
            if (F == 1) {
                sb.insert(0, C);
                continue;
            }
            sb.append(C);
        }
        System.out.println(sb.toString());
    }
}