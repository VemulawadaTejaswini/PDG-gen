import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean isPossible = false;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i*m + j*n - 2*i*j == k){
                    isPossible = true;
                    break;
                }
            }
            if (isPossible)break;
        }

        System.out.println(isPossible?"Yes":"No");
    }
}
