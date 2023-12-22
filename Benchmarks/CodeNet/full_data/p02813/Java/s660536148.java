import java.util.Scanner;

class Main {
    public static int factorial(int n) {
        if (n == 0) { 
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(stdIn.next());
        }
        for (int i = 0; i < n; i++) {
            q[i] = Integer.parseInt(stdIn.next());
        }

        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            int minus = 0;
            for (int j = 0; j < i; j++) {
                if (p[j] < p[i]) minus++;
            }
            a += (p[i] - 1 - minus) * factorial(n - i - 1);
            
        }
        for (int i = 0; i < n; i++) {
            int minus = 0;
            for (int j = 0; j < i; j++) {
                if (q[j] < q[i]) minus++;
            }
            b += (q[i] - 1 - minus) * factorial(n - i - 1);
        }

        int ans = a - b;
        if (ans < 0) ans *= -1;
        System.out.println(ans);
    }
}