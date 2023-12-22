import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] b = new int[n-1];
        for (int i = 0; i< n - 1; i++) {
            b[i] = scan.nextInt();
        }

        int ans = b[0];
        for (int i = 0; i < n-2; i++) {
            ans += Math.min(b[i], b[i+1]);
        }
        ans += b[n-2];
        System.out.println(ans);
    }

}