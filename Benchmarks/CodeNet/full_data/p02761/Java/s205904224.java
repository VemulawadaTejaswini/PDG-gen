import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        int[] d = new int[N];
        int[] cnt = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            d[s-1] = Math.min(d[s-1], c);
        }

        int min = Integer.MAX_VALUE;
        a: for (int i = 0; i < 1000; i++) {
            String str = String.valueOf(i);
            if (str.length() < N) continue;
            for (int j = 0; j < M; j++) {
                if (d[j] != Integer.MAX_VALUE && Character.getNumericValue(str.charAt(j)) != d[j]) {
                    continue a;
                }
                if (d[j] != Integer.MAX_VALUE && Character.getNumericValue(str.charAt(j)) == d[j]) {
                    cnt[j]++;
                }
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
