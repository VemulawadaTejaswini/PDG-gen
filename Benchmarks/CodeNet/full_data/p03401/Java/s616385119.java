public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int sum = 0, last = 0;
        int[] a = new int[n + 2];
        for (int i = 1; i <= n; i++)
            sum += Math.abs(last - (last = a[i] = scanner.nextInt()));
        sum += Math.abs(last);
        for (int i = 1; i <= n; i++)
            System.out.println(sum - ((a[i - 1] >= a[i] && a[i] >= a[i + 1]) || (a[i - 1] <= a[i] && a[i] <= a[i + 1]) ? 0 : Math.abs(a[i - 1] > a[i] ? Math.min(a[i - 1], a[i + 1]) - a[i] : Math.max(a[i - 1], a[i + 1]) - a[i]) * 2));
    }
}