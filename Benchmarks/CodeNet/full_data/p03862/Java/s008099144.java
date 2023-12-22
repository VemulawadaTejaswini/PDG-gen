public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), x = scanner.nextInt(), ans = 0;
        for (int i = 1, l = scanner.nextInt(), t; i < n; i++)
            ans += (t = scanner.nextInt()) - (l = Math.min(x - l, t));
        System.out.println(ans);
    }
}