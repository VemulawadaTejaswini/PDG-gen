import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        if (K > Q) {
            for (int i = 0; i < n; i++) {
                System.out.println("Yes");
            }
            return;
        }
        int[] persons = new int[n];
        for (int i = 0; i < Q; i++) {
            int correct = sc.nextInt();
            persons[correct - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (persons[i] > Q - K) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
