import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        int N = Integer.valueOf(scanner.next());
        int M = Integer.valueOf(scanner.next());

        Integer[] ok = new Integer[N], ng = new Integer[N];
        Arrays.fill(ok, 0);Arrays.fill(ng, 0);

        Integer pre = -1;
        for (int i = 0; i < M; i++) {
            int P = Integer.valueOf(scanner.next());
            String S = scanner.next();
            if(pre == P) continue;

            if("AC".equals(S)) {
                ok[P-1] += 1;
                pre = P;
            }
            if("WA".equals(S)) ng[P-1] += 1;
        }

        System.out.println(Stream.of(ok).mapToInt(Integer::intValue).sum());
        System.out.println(Stream.of(ng).mapToInt(Integer::intValue).sum());
    }
}