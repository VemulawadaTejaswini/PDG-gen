public class Main {
    public static void main(final String[] args) {
        final Scanner stdIn = new Scanner(System.in);
        for (int i = 1;; i++) {
            int x = stdIn.nextInt();
            if (x == 0) {
                break;
            }
            System.out.printf("Case %d: %d\n", i, x);
        }
    }
}
