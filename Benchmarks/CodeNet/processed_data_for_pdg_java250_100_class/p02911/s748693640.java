public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        long K = Long.parseLong(scanner.next());
        int Q = Integer.parseInt(scanner.next());
        int[] A = new int[Q];
        for (int i = 0; i < Q; i++) {
            A[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();
        long[] ansCount = new long[N];
        for (int i = 0; i < Q; i++) {
            int correctIndex = A[i] - 1;
            ansCount[correctIndex]++;
        }
        for (int i = 0; i < N; i++) {
            boolean isWin = K - Q + ansCount[i] >= 1;
            System.out.println(isWin ? "Yes" : "No");
        }
    }
}
