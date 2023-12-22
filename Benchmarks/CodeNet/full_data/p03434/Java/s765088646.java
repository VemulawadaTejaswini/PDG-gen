import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int totala = 0;
        int totalb = 0;
        for (int i = a.length - 1; i >= 0; i -= 2) {
            totala += a[i];
            if (i > 0) {
                totalb += a[i - 1];
            }
        }

        System.out.println(totala - totalb);
    }
}
