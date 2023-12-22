import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        int[] p = new int[n];
        p[0] = Integer.parseInt(stdIn.next());
        int min = p[0];
        int ans = 1;
        for (int i = 1; i < n; i++) {
            p[i] = Integer.parseInt(stdIn.next());
            if (min > p[i]) {
                min = p[i];
                ans++;
            }
        }

        System.out.println(ans);
    }
}