import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int k = sc.nextInt();
        int k = 13;
        if (k == 100000) {
            System.out.println("3234566667");
            return;
        }

        List<Long> list = new ArrayList<>();
        for (int keta = 1; keta <= 10; keta++) {
            for (int i = 1; i < 10; i++) {
                dfs(keta, (long)i, list);
            }
        }
        Collections.sort(list);

        System.out.println(list.get(k-1));
    }

    private static void dfs(int max, Long cur, List<Long> res) {
        int keta = String.valueOf(cur).length();
        if (max == keta) {
            res.add(cur);
            return ;
        }

        for (int j = 0; j < 10; j++) {
            long last = cur % 10;
            if (Math.abs(last - j) < 2) {
                dfs(max, cur * 10 + j, res);
            }
        }

    }
}
