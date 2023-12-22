import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[] w = new int[100010];
    static int[] v = new int[100010];
    static int[][] dp = new int[110][100010];
    static int k;

    static int chmin(int a, int b) {
        if (a > b) {
            a = b;
            return a;
        }
        return a;
    }

    static int chmax(int a, int b) {
        if (a < b) {
            a = b;
            return a;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();
        char[] array = s.toCharArray();
        char num = '1';
        for (int i = 0; i < n; i++) {
            if (array[i] != '1') {
                num = array[i];
                break;
            }
        }
        if (s.charAt(0) == 1 && n == 1) {
            System.out.println(1);
        } else if (s.charAt(0) == '1' && n > 1) {
            System.out.println(num);
        } else {
            System.out.println(s.charAt(0));
        }

    }
}
