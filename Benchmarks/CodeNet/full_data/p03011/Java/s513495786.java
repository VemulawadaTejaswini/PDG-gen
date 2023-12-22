import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int P = scan.nextInt();
        int Q = scan.nextInt();
        int R = scan.nextInt();
        int answer = P + Q;
        answer = Math.min(answer, Q + R);
        answer = Math.min(answer, R + P);
        System.out.println(answer);
    }
}
