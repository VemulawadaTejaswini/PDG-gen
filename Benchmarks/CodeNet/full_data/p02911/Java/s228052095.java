import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] persons = new int[n];
        for (int i = 0; i < n; i++) {
            persons[i] = K;
        }
        for (int i = 0; i < Q; i++) {
            int correct = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if (j != correct - 1) {
                    persons[j]--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (persons[i] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
