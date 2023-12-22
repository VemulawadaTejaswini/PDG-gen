import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int data[][] = new int[n][20];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            for (int j = 0; j < 20; j++) {
                data[i][j] = a % 2;
                a /= 2;
            }
        }

        for (int i = 0; i < 20; i++) {
            int end1 = n - 1;
            int end2 = n - 1;
            for (int j = n - 1; j >= 0; j--) {
                if (data[j][i] == 1) {
                    end1 = end2;
                    end2 = j - 1;
                    data[j][i] = end1;
                } else {
                    data[j][i] = end1;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += ((Arrays.stream(data[i]).min().getAsInt() - i) + 1);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
