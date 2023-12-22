import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            int minPoint = k - q;
            points[i] = minPoint;
        }

        for (int i = 0; i < q; i++) {
            points[sc.nextInt()-1]++;
        }

        for (int i = 0; i < n; i++) {
            if (points[i] < 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}