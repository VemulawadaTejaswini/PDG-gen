import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        Integer[] a = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // p = 0の時は1つも選ばないパターンをカウント
        int pattern = (p == 0) ? 1 : 0;

        for (int i = 0 ; i < n - 1; i++) {
            if ((a[i] & 1) == p) {
                ++pattern;
            }

            int sum = a[i];

            for (int j = i + 1;j < n; j++) {
                sum += a[j];
                if ((sum & 1) == p) {
                    ++pattern;
                }

                if (j != i + 1) {
                    int ijSum = a[i] + a[j];

                    if ((ijSum & 1) == p) {
                        ++pattern;
                    }
                }
            }
        }

        System.out.println(pattern);
    }

}