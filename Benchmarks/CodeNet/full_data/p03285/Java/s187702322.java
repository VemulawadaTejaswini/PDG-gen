
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        boolean found  = false;
        for (int i = 0; i * 4 <= N; i++) {
            for (int j = 0; i* 4 + j * 7 <= N; j++) {
                if (i * 4 +  j * 7 == N) {
                    found = true;
                }
            }
        }
        System.out.println(found ? "Yes" : "No");
    }
}
