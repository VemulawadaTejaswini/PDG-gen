public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;; ++i) {
            int j = scanner.nextInt();
            if (j == 0)
                return;
            System.out.printf("Case %d: %d\n", i+1, j);
        }
    }
}
