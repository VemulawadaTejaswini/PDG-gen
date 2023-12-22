import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        int answer = solve(S);
        System.out.println(answer);
    }
    public static int solve(String S) {
        char[] data = S.toCharArray();
        int answer = check(data, true);
        answer = Math.min(answer, check(data, false));
        return answer;
    }
    private static int check(char[] data, boolean way) {
        int length = data.length;
        int answer = 0;
        for (int i = 0; i < length; i++) {
            int target;
            if (way) {
                target = i % 2 == 0 ? '0' : '1';
            } else {
                target = i % 2 == 0 ? '1' : '0';
            }
            if (target != data[i]) {
                answer += 1;
            }
        }
        return answer;
    }
}
