import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] list = new Integer[N];
        for (int i = 0; i < N; i++) {
            list[i] = scanner.nextInt();
        }
        int result = 0;
        for (int i = 0; i<N; i++) {
            for (int j = 0; j<N; j++) {
                if (i ==j) {
                    continue;
                }
                for (int k=j; k<N; k++) {
                    if (j == k) {
                        continue;
                    }
                    if (i == k) {
                        continue;
                    }
                    if (list[j] == list[k]) {
                        result++;
                    }
                }
            }
            System.out.println(result);
            result = 0;
        }
    }
}