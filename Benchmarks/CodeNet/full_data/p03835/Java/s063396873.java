import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k, s;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        s = sc.nextInt();
        int x, y, z;
        if (s == 3 * k) {
            count = 1;
        } else {
            for (x = k; x >= 0; x--) {
                if (s - x <= 2 * k) {
                    if (s - x < k) {
                        for (y = s - x; y >= 0; y--) {
                            count++;
                            z = s - x - y;
                        }
                    } else {
                        for (y = k; (y >= s - 2 * k) && (y >= 0); y--) {
                            count++;
                            z = s - x - y;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}