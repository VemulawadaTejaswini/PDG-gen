import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] m = new int[n*(n-1)/2];
        int c=0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                m[c]=a[i]*a[j];
                c++;
            }
        }
        Arrays.sort(m);
        System.out.println(m[k]);
    }
}
