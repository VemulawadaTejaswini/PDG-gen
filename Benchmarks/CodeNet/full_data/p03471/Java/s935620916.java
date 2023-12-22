import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int ans = 0;

        Integer n = sc.nextInt();
        Integer y = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                int s = i * 10000 + j * 5000;
                if ((y - s) / 1000 == n - i - j) {
                    System.out.println("" + i + " " + j + " " + (y - s) / 1000);
                    sc.close();
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
        sc.close();
    }
}
