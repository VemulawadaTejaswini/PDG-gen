public class Main {
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final long N = sc.nextLong();
        final long A = sc.nextLong();
        final long B = sc.nextLong();
        long result = 0;
        if(A == 0) {
            result = 0;
        } else if (B == 0) {
            result = N;
        }else {
            long sum = N / (A + B);
            long remain = N % (A + B);
            result = sum * A;
            result += remain >= A ? A : remain;
        }
        System.out.println(result);
    }
}
