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
        int counta = 0;
        while (current < length) {
            if (length <= current + 2) {
                break;
            }
            if (data[current] != 'A') {
                current += 1;
                counta = 0;
                continue;
            }
            int temp = current;
            for (int j = temp; j < length - 1; j++) {
                if (data[j] == 'A') {
                    counta+=1;
                    continue;
                }
                if (data[j] == 'B' && data[j+1] == 'C') {
                    answer += counta;
                    current = j+1;
                    data[j+1] = 'A';
                    counta -= 1;
                    break;
                }
                counta = 0;
                current += j;
                break;
            }

        }

        System.out.println(answer);
    }
}
