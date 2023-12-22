import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int W = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (b < a) {
            int t = a;
            a = b;
            b = t;
        }
        int answer = 0;
        if (b <= a + W) {
            answer = 0;
        } else {
            answer = b - a - W;
        }
        System.out.println(answer);
    }
}
