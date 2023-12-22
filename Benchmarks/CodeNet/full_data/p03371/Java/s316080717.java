public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);
 
    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ab = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int ans1 = a * x + b * y;
        int ans2 = x < y ? ab * x * 2 + b * (y - x) : ab * y * 2 + a * (x - y);
        int ans3 = ab * Math.max(x, y) * 2;
        System.out.println(Math.min(Math.min(ans1, ans2), ans3));
    }
}