import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            // 奇数のみ
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    if (i % j == 0) {
                        cnt++;
                    }
                }
                if (cnt == 8) list.add(1);
            }
            cnt = 0;
        }
        System.out.println(list.size());
    }
}
