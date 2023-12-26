public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int K = sc.nextInt(); 
        int[] d = new int[K]; 
        int[][] A = new int[K][N]; 
        int[] sunuke = new int[N];
        for (int i = 0; i < K; i++) {
            d[i] = sc.nextInt();
            for (int j = 0; j < d[i]; j++) {
                A[i][sc.nextInt() - 1]++;
            }
        }
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] != 0) {
                    sunuke[j]++;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (sunuke[i] == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
