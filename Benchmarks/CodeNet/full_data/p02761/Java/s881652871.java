import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        int[] cnt = new int[N];
        int[] s = new int[M];
        int[] c = new int[M];
        for (int i = 0; i < M; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        a: for (int i = 0; i < 1000; i++) {
            String str = String.valueOf(i);
            if (str.length() < N) continue;
            for (int j = 0; j < M; j++) {
                if (Character.getNumericValue(str.charAt(s[j]-1)) != c[j]) {
                    continue a;
                }
                cnt[s[j]-1] += c[j];
            }
            min = Math.min(min, Integer.valueOf(str));
        }

        if (cnt[0] == 0 || String.valueOf(min).length() < N) {
            System.out.println(-1);
            return;
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}
