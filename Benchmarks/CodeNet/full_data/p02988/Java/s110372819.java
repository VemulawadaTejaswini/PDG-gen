import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++) {
            p[i] = scan.nextInt();
        }

        int cnt = 0;
        for(int i = 1; i < n -1; i++) {
            int a = p[i - 1];
            int b = p[i];
            int c = p[i + 1];

            int max = Math.max(Math.max(a, b), Math.max(a, c));
            int min = Math.min(Math.min(a, b), Math.min(a, c));
            if (max != b && min != b) {
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}