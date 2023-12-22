import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int K = scan.nextInt();
        int S = scan.nextInt();
        long answer = 0;
        for (int x = 0; x <= K; x++) {
            for (int y = 0; y <= K; y++) {
                if (S < x + y) {
                    break;
                }
                for (int z = 0; z <= K; z++) {
                    if (x + y + z == S) {
                        answer += 1;
                    }
                    if (S < x + y + z) {
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
