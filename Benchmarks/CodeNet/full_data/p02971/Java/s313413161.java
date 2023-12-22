import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int[] max = new int[2];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (max[0] <= a[i]) {
                max[1] = max[0];
                max[0] = a[i];
            } else if (max[1] < a[i]) {
                max[1] = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (max[0] == a[i])
                System.out.println(max[1]);
            else
                System.out.println(max[0]);
        }
    }
}