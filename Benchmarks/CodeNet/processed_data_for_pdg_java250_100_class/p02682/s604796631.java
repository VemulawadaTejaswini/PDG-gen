public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();
        if(A > K) {
            System.out.println(K);
            return;
        }
        if(A == K) {
            System.out.println(A);
            return;
        }
        if(A + B == K) {
            System.out.println(A);
            return;
        }
        int ans = K - (A+B);
        System.out.println( A - ans );
    }
}
