import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int X = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        String answer = "";
        if (B <= A) {
            answer = "delicious";
        } else if (B - A <= X) {
            answer = "safe";
        } else {
            answer = "dangerous";
        }
        System.out.println(answer);
    }
}
