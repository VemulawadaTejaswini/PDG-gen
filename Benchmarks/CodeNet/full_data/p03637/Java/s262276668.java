public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int c = 0, c2 = 0, c4 = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            if ((a[i] = scanner.nextInt()) % 4 == 0) c4++;
            else if (a[i] == 2) c2++;
            else c++;
        }

        System.out.println(c - (c2 == 0 ? 1 : 0) <= c4 ? "Yes" : "No");
    }
}