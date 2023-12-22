import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Problem {
    private int N;
    private int M;
    private Long[][] shops;

    Problem() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        shops = new Long[N][2];

        for (int i = 0; i < N; i++){
            shops[i][0] = sc.nextLong();
            shops[i][1] = sc.nextLong();
        }
    }

    long solve() {
        Arrays.sort(shops, new Comparator<Long[]>() {
            @Override
            public int compare(Long[] o1, Long[] o2) {
                return Long.compare(o1[0], o2[0]);
            }
        });

        long ans = 0;
        long m = M;
        int i = 0;
        while (m > 0) {
            long n = Math.min(shops[i][1], m);
            ans += shops[i][0] * n;
            m -= n;
            i++;
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
