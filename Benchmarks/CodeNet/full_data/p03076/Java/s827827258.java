import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];
        
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            b[i] = 10 - a[i] % 10;
            b[i] = b[i] == 10 ? 0 : b[i];
            ans += a[i] + b[i];
        }

        Arrays.sort(b);
        ans -= b[4];
        
        System.out.println(ans);
    }
}
