import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = sc.nextInt();

        int cnt = 0;
        for (int i=0; i*x<=n; i++) {
            for (int j=0; (i*x)+(j*y)<=n; j++) {
                for (int k = 0; (i * x) + (j * y) + (k * z) <= n; k++) {
                    if (n == (i * x) + (j * y) + (k * z)) {
                        cnt++;
                    }
                }
            }
        }        System.out.println(cnt);
    }
}
