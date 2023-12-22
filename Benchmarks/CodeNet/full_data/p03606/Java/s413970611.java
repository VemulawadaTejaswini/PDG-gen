import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long answer = 0;
        for (int i = 0; i < N; i++) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            answer += r-l+1;
        }
        System.out.println(answer);
    }
}
