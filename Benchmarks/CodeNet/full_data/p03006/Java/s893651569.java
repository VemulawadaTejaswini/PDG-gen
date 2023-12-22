import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();

        }
        sc.close();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                int difx = x[i] - x[j];
                int dify = y[i] - y[j];
                int tmp = 0;
                for (int k = 0; k < n - 1; k++) {
                    int sax = x[k + 1] - x[k];
                    int say = y[k + 1] - y[k];
                    if (difx == sax && dify == say) {
                        tmp++;
                    }
                }
                if (tmp > ans) {
                    ans = tmp;
                }
            }

        }
        ans = n - ans;
        if (n == 1) {
            ans = 1;
        }
        System.out.println(ans);
        sc.close();
    }
}
