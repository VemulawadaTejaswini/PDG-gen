public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] A = new int[N];
        Arrays.fill(A, K - Q);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            A[sc.nextInt() - 1]++;
        }
        for (int i = 0; i < N; i++) {
            if (A[i] <= 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
