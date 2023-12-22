import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int[][] list = new int[n][d];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
              list[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < d; k++) {
                    int value = list[i][k] - list[j][k];
                    sum += value * value;
                }
                double root = Math.sqrt(sum);
                int seisu = (int) root;
                if ((double)seisu - root == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
