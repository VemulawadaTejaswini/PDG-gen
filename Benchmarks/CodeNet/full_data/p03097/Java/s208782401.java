import java.util.Scanner;

class Problem {
    private int N;
    private int A;
    private int B;

    Problem() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
    }

    private int getNext(int prev, int cur, boolean[] used) {
        int selector;
        if (cur < 0) {
            selector = 0x1;
        } else {
            selector = (prev ^ cur) << 1;
        }
        while (selector < (0x1 << N)) {
            int t = (prev & selector) > 0 ? prev - selector : prev + selector;
            if (t < (0x1 << N) && !used[t]) {
                return t;
            }
            selector = selector << 1;
        }
        return -1;
    }

    void solve() {
        int M = 0x1 << N;
        int[] ans = new int[M];
        for (int i = 0; i < M; i++) {
            ans[i] = -1;
        }

        boolean[] used = new boolean[M + 1];
        ans[0] = A;
        used[A] = true;

        int i = 1;
        while (i > 0 && i < M) {
            int c = getNext(ans[i-1], ans[i], used);
            if (c < 0 || (i == M - 1 && c != B)) {
                if (ans[i] >= 0){
                    used[ans[i]] = false;
                }
                i -= 1;
            } else {
                ans[i] = c;
                used[ans[i]] = true;
                i += 1;
            }
        }
        if (i == M) {
            System.out.println("YES");
            for (int j = 0; j < ans.length; j++){
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(ans[j]);
            }
        } else {
            System.out.println("NO");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new Problem().solve();
    }
}
