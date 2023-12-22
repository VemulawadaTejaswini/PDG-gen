public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] sum = new int[n];

        for (int i = 0; i < n; i++)
            sum[i] = (i == 0 ? 0 : sum[i - 1]) + scanner.nextInt();
        for (int i = 0; i < n; i++)
            for (int i1 = 0, temp = scanner.nextInt(); i1 <= i; i1++)
                sum[i1] += temp;

        int ans = sum[0];
        for (int i = 1; i < n; i++)
            ans = Math.max(ans, sum[i]);
        System.out.println(ans);
    }
}