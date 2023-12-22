import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int many = 0;
        int check[] = new int[M];
        int ab[][] = new int[2][M];
        boolean ans = false;
        int k = 0;
        for (int i = 0; M > i; i++) {
            ab[0][i] = sc.nextInt();
            ab[1][i] = sc.nextInt();
            if (ab[0][i] == 1) {
                check[k] = ab[1][i];
                many++;
                k++;
            }
        }
        lave:
        for (int j = 0; M > j; j++) {
            if (ab[1][j] == N) {
                for (int l = 0; many >= l; l++) {
                    if (ab[0][j] == check[l]) {
                        ans = true;
                        break lave;
                    }
                }
            }
        }
        if (ans == true) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }

    }
}