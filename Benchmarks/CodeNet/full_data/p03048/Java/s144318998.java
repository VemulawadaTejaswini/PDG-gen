import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int ans = 0;
        for (int i = 0; i*r <= n; i++) {
            for (int j = 0; j*g <= n; j++) {
                for (int k = 0; k*b <= n; k++) {
                    int num = i * r + j * g + k * b;
                    if (num == n)
                        ans++;
                    if (num > n)
                        break;
                }
            }
        }

        System.out.println(ans);
    }
}