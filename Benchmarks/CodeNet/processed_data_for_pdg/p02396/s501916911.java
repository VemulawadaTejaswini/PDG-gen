public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        while (true) {
            int n = input.nextInt();
            if (n == 0) break;
            System.out.println(String.format("Case %d: %d", count++, n));
        }
    }
}
