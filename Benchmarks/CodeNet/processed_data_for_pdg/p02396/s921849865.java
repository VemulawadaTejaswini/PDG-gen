public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(true) {
            i++;
            int n = scanner.nextInt();
            if (n == 0) break;
            System.out.printf("Case %d: %d\n", i, n);
        }
        scanner.close();
    }
}
