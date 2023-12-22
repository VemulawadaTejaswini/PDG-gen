import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] data = S.toCharArray();
        int length = data.length;
        long answer = 0;
        int current = 0;
        while (current < length) {
            if (length <= current + 2) {
                break;
            }
            if (data[current] != 'A') {
                current += 1;
                continue;
            }
            if (data[current+1] == 'B' && data[current+2] == 'C') {
                data[current] = 'B';
                data[current+1] = 'C';
                data[current+2] = 'A';
                answer += 1;
                if (1 <= current && data[current-1] == 'A') {
                    current -= 1;
                } else {
                    current += 2;
                }
                continue;
            }
            current += 1;
        }

        System.out.println(answer);
    }
}
