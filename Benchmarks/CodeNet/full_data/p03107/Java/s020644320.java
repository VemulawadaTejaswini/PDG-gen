import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] data = S.toCharArray();
        int N = S.length();
        int zero_count = 0;
        int one_count = 0;
        for (int i = 0; i < N; i++) {
            if (data[i] == '0')  {
                zero_count += 1;
            }
            if (data[i] == '1') {
                one_count += 1;
            }
        }
        System.out.println(S.length() - Math.abs(zero_count - one_count));
    }
}
