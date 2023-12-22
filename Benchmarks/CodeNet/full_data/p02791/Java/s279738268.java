import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(stdIn.next());
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (p[i] > p[j]) {
                    break;
                }
                if (j == i) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}