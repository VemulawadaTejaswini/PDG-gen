import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int min = a[0];
        int max = a[1];
        while (max > 0) {
            if (max < min) {
                int i = max;
                max = min;
                min = i;
            }
            max -= min;
        }
        
        System.out.println(min);
    }
}
