import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        System.out.println(solve(A, B));
    }
    public static String solve(int A, int B) {
        if (8 < A) {
            return ":(";
        }
        if (8 < B) {
            return ":(";
        }
        return "Yay!";
    }
}
