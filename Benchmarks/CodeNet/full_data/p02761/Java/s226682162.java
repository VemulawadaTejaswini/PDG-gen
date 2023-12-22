import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        final int[] s = new int[M];
        for (int i = 0; i < M; i++) {
            s[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            s[a-1] = Math.min(s[a-1], b);
        }

        int initValue = (int) Math.pow(10, N-1);

        int min = Integer.MAX_VALUE;
        for (int i = initValue; i < 1000; i++) {
            String str = String.valueOf(i);

            if (str.length() < N) continue;

            boolean b = true;
            for (int j = 0; j < M; j++) {
                int c = Character.getNumericValue(str.charAt(j));
                if (s[j] != Integer.MAX_VALUE && c != s[j]) b = false;
            }

            if (s[0] == Integer.MAX_VALUE) continue;

            if (b) {
                min = Math.min(min, i);
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
}
