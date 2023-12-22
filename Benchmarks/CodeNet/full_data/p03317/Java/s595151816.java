import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        count++;
        n -= k;
        if (n % 2 == 0)
            System.out.println(count + n / 2);
        else
            System.out.println(count + n / 2 + 1);
    }
}
