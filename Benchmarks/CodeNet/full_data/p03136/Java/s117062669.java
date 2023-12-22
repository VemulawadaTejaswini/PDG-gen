import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l[] = new int[n];
        int wa = 0;
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            wa += l[i];
        }
        Arrays.sort(l);
        wa = wa - l[n - 1];
        if (wa > l[n - 1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
