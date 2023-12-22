import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        System.out.println(solve(N));
    }
    public static String solve(int N) {
        String str = Integer.toString(N, 10);
        char[] data = str.toCharArray();
        int base = 0;
        for(char c : data) {
            base += (c-48);
        }
        return N % base == 0 ? "Yes" : "No";
    }
}
