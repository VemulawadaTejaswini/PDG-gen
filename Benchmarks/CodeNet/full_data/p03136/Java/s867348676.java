import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(l);

        int sum = 0;
        int max = l[l.length - 1];
        for (int i = 0; i < n - 1; i++) {
            sum += l[i];
        }

        if (max < sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
