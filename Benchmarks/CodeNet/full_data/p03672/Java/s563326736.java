import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        int length = S.length();
        char[] data = S.toCharArray();
        int answer = 0;
        for (int i = 1; 2*i < length; i++) {
            int remain = length - 2*i;
            int len = remain / 2;
            boolean found = true;
            for (int j = 0; j < len; j++) {
                if (data[j] != data[len + j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                answer = remain;
                break;
            }
        }
        System.out.println(answer);
    }
}
