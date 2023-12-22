import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        outside:for (int i = 0; i <= y / 10000; i++) {
            for (int j = 0; j <= (y - 10000 * i) / 5000; i++) {
                int x = y - 10000 * i - 5000 * j;
                if (x >= 0 && x / 1000 == n - i - j) {
                    System.out.println(i + " " + j + " " + x / 1000);
                    break outside;
                }
            }
        }
        sc.close();
    }
}