import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int p = scan.nextInt();
            ans += p;
            max = Math.max(max, p);
        }
        System.out.println(ans - (max/2));
    }
}
