import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] map;
    static int[][] label;


    static ArrayList<String> list;

    static int M;
    static int N;
    static int T;
    static int P;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] map = new long[n];



        for (int i = 0; i < n; i++) {
            map[i] = scanner.nextLong();
        }

        long sum = map[0];
        long ans = 0;
        boolean sign = true;
        if(sum < 0){
            sign = false;
            sum = -1;
        }

        for (int i = 1; i < n; i++) {
            sum += map[i];
            if (sign) {
                if (sum >= 0) {
                    ans += sum + 1;
                    sum = -1;
                }
                sign = false;
            } else {
                if (sum <= 0) {
                    ans -= sum - 1;
                    sum = 1;
                }
                sign = true;
            }
        }

        sum = map[0];
        long ans2 = 0;
        sign = false;
        if(sum < 0){
            sign = true;
            sum = 1;
        }

        for (int i = 1; i < n; i++) {
            sum += map[i];
            if (sign) {
                if (sum >= 0) {
                    ans2 += sum + 1;
                    sum = -1;
                }
                sign = false;
            } else {
                if (sum <= 0) {
                    ans2 -= sum - 1;
                    sum = 1;
                }
                sign = true;
            }
        }



        System.out.println(Math.min(ans, ans2));
    }



}
