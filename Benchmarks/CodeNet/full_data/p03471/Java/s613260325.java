import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// N枚
        int Y = sc.nextInt();// Y円

        int x = -1;// 10000円をx枚
        int y = -1;// 5000円をy枚
        int z = -1;// 1000円をz枚

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k <= N; k++) {
                    if (i + j + k > N) continue;

                    int tmpSum = (10000 * i) + (5000 * j) + (1000 * k);
                    if (tmpSum == Y) {
                        x = i;
                        y = j;
                        z = k;

                        break;
                    }
                }
                if (x > 0 && y > 0 && z > 0) break;
            }
            if (x > 0 && y > 0 && z > 0) break;
        }

        System.out.println(x + " " + y + " " + z);
    }
}
