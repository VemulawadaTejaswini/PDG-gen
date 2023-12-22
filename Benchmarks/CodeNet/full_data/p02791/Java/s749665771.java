import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int min = p[0];
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (p[i] < min) {
                ans++;
                min = p[i];
            }
        }
        System.out.println(ans);
    }

}
