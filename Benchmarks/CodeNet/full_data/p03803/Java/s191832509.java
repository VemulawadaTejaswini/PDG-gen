import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        String answer = answer(A, B);
        System.out.println(answer);
    }
    public static String answer(int A, int B) {
        if (A == 1) {
            A = 14;
        }
        if (B == 1) {
            B = 14;
        }
        if (A == B) {
            return "Draw";
        }
        if (A > B) {
            return "Alice";
        }
        return "Bob";
    }
}
