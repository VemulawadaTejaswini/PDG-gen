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
        while (true) {
            boolean found = false;
            int current = 0;
            while (current <= length - 3) {
                if (data[current] == 'A' && data[current + 1] == 'B' && data[current + 2] == 'C') {
                    data[current] = 'B';
                    data[current + 1] = 'C';
                    data[current + 2] = 'A';
                    answer += 1;
                    current += 3;
                    found = true;
                    continue;
                }
                current += 1;
            }
            if (!found) {
                break;
            }
        }
        System.out.println(answer);
    }
}
