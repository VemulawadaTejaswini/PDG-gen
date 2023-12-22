import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<List<Integer>> bulbs = new ArrayList<>();
        for (int i = 0; i < M; ++i) bulbs.add(new ArrayList<>());
        for (int i = 0; i < M; ++i) {
            int k = sc.nextInt();
            for (int j = 0; j < k; ++j) {
                bulbs.get(i).add(sc.nextInt()-1);
            }
        }
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < M; ++i) p.add(sc.nextInt());

        int res = 0;
        for (int bit = 0; bit < (1<<N); ++bit) {
            boolean flag = true;
            for (int i = 0; i < M; ++i) {
                int cnt = 0;
                for (int j = 0; j < bulbs.get(i).size(); ++j) {
                    int s = bulbs.get(i).get(j);
                    if ((bit & (1<<s)) != 0) ++cnt;
                }
                if (cnt % 2 != p.get(i)) flag = false;
            }
            if (flag) ++res;
        }

        System.out.println(res);
    }
}