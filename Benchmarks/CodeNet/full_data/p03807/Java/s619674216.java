public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        final int[] A = new int[N];// 2 <= N
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt() % 2;
        }
        String ans = "YES";

        int count = 0;
        for (int a : A) {
            count += a;
        }
        if (count % 2 == 1) {
            ans = "NO";
        }

        System.out.println(ans);
    }
}