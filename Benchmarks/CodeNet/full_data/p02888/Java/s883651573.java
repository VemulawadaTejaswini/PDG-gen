import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = scanner.nextInt();
        }
        scanner.close();

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if ((L[i] < L[j] + L[k]) && (L[j] < L[i] + L[k]) && (L[k] < L[i] + L[j])) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }

}
