import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            int tmpMax = 0;
            for (int j = i; j < n - 1; j++) {
                if (h[j] >= h[j + 1]) {
                    tmpMax++;
                } else {
                    break;
                }
            }
            if (tmpMax > max) {
                max = tmpMax;
            }
        }

        System.out.println(max);

        sc.close();
    }
}
