import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        int length = S.length();
        char[] data = S.toCharArray();
        int win = 0;
        for (int i = 0; i < length; i++) {
            if (data[i] == 'o') {
                win += 1;
            }
        }
        win += 15 - length;
        String answer = "NO";
        if (8 <= win) {
            answer = "YES";
        }
        System.out.println(answer);
    }
}
