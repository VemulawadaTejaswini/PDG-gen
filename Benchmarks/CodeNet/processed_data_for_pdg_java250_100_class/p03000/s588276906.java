public class Main {
    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] L = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            L[i] = sc.nextInt();
        }
        int boundCnt = 1;
        int distance = 0;
        for (int i = 1; i < N + 1; i++) {
            distance += L[i];
            if (distance > X) break;
            boundCnt++;
        }
        System.out.println(boundCnt);
    }
}
