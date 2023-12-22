import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        int answer = B;
        if (A <= 5) {
            answer = 0;
        } else if (6 <= A && A <= 12) {
            answer = answer / 2;
        }
        System.out.println(answer);
    }
}
