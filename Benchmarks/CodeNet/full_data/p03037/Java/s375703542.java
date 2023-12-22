import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] L = new int[M];
        int[] R = new int[M];
        int[] cnt = new int[N];
        int ans = 0;
        for (int i = 0; i < M; i++) {
            L[i] = scanner.nextInt();
            R[i] = scanner.nextInt();
        }
        for (int i = 0; i < M; i++) {
            for (int j = L[i] - 1; j < R[i]; j++) {
                cnt[j]++;
            }
        }
        for (int i : cnt) {
            if (i == M) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
