import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        String s = scan.next();
        int R = 0;
        int B = 0;
        char[] data = s.toCharArray();
        for(char c : data) {
            if (c == 'R') {
                R += 1;
                continue;
            }
            B += 1;
        }
        String answer = "No";
        if (R > B) {
            answer = "Yes";
        }
        System.out.println(answer);
    }
}
