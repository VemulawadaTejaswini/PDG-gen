import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long k = scan.nextLong();
        int q = scan.nextInt();
        int[] a = new int[q];
        long[] point = new long[n];
        for (int i = 0; i < q; i++) {
            point[scan.nextInt()-1] += 1;
        }
        for (int i = 0; i < n; i++) {
            long cnt = (point[i] + k) - q;
            String message = cnt > 0 ? "Yes" : "No";
            System.out.println(message);
        }

    }
}