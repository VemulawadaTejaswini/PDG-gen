import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        int length = S.length();
        char[] d = S.toCharArray();
        int limit = pow(2, length-1);
        long answer = 0;
        for (int i = 0; i < limit; i++) {
            int[] position = position(length-1, i);
            int current = 0;
            for (int j = 0; j < length; j++) {
                current *= 10;
                current += d[j] - '0';
                if (j == length - 1 || position[j] == 1) {
                    answer += current;
                    current = 0;
                }
            }
        }
        System.out.println(answer);
    }
    public int[] position(int length, int target) {
        int[] position = new int[length];
        if (target == 0) {
            return position;
        }
        int index = 0;
        while (target > 0) {
            if (target % 2 == 1) {
                position[index] = 1;
            }
            target /= 2;
            index += 1;
        }
        return position;
    }
    public int pow(int m, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 1) {
            return m*pow(m, n-1);
        }
        int x = pow(m, n/2);
        return x * x;
    }
}
