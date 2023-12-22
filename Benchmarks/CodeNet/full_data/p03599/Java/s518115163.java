import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int E = scan.nextInt();
        int F = scan.nextInt();
        int max_total = 0;
        int max_salt = 0;
        double max_percentage = -1;
        for (int i = 0; i * 100 * A <= F; i++) {
            for (int j = 0; j * 100 * B <= F - i * 100 * A; j++) {
                int water = i * 100 * A + j * 100 * B;
                if (water == 0) {
                    continue;
                }
                int max_ok_salt = water / 100 * E;
                double percentage = 0;
                if (max_percentage < percentage) {
                    max_percentage = percentage;
                    max_total = water;
                    max_salt = 0;
                }
                for (int k = 0; k * C <= F - water; k++) {
                    for (int l = 0; l * D <= F - water - k * C; l++) {
                        int salt = k * C + l * D;
                        if (max_ok_salt < salt) {
                            continue;
                        }
                        percentage = (double) salt * 100 / (water + salt);
                        if (max_percentage < percentage) {
                            max_percentage = percentage;
                            max_total = water + salt;
                            max_salt = salt;
                        }
                    }
                }
            }
        }
        System.out.println(max_total + " " + max_salt);
    }
}
