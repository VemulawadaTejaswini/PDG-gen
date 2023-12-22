public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();

        long m1 = 0, m2 = 0, s1 = 0, s2 = 0;
        for (int i = 0; i < n; i++) {
            s1 += a[i];
            s2 += a[i];
            if ((i & 1) == 0) {
                if (s1 <= 0) {
                    m1 += Math.abs(s1) + 1;
                    s1 = 1;
                } if (s2 >= 0) {
                    m2 += Math.abs(s2) + 1;
                    s2 = -1;
                }
            } else {
                if (s1 >= 0) {
                    m1 += Math.abs(s1) + 1;
                    s1 = 1;
                } if (s2 <= 0) {
                    m2 += Math.abs(s2) + 1;
                    s2 = -1;
                }
            }
        }
        System.out.println(Math.min(m1, m2));
    }
}