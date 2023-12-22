import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int[] d = new int[999];
        for(int i = 0; i < 999; i++) {
            d[i] = i + 1;
        }
        int[] s = new int[999];
        s[0] = d[0];
        for(int i = 1; i < 999; i++) {
            s[i] = s[i-1] + d[i];
        }
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(solve(s, a, b));
    }
    public static int solve(int[] s, int a, int b) {
        int diff = b - a;
        int i = 0;
        for(i = 1; i < 999; i++) {
            if (s[i] - s[i-1] == diff) {
                break;
            }
        }
        return s[i] - b;
    }
}
