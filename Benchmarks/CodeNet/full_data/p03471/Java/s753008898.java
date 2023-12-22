import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();

        int[] result = hoge(n, y);
        System.out.printf("%d %d %d\n", result[0], result[1], result[2]);
    }

    private static int[] hoge(int n, int y) {
        int[] result = {-1, -1 ,-1};

        int s = 0;
        for (int i = 0; i <= 2000; i++) {
            for (int j = 0; j <= 2000; j++) {
                s = y - (10000 * i + 5000 * j);
                if (s < 0) {
                    break;
                }
                if (s/1000 == (n-(i+j))) {
                    result[0] = i;
                    result[1] = j;
                    result[2] = s/1000;
                    return result;
                }
            }
        }
        return result;
    }
}