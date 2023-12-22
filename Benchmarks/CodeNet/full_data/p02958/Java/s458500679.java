import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; i++) p[i] = sc.nextInt();

        int[] pSorted = p.clone();
        Arrays.sort(pSorted);

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (p[i] != pSorted[i]) {
                cnt++;
            }
        }

        System.out.println(cnt > 2 ? "NO" : "YES");
    }
}