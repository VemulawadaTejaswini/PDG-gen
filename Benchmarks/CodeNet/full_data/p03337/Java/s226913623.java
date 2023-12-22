import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(solve(a,b));
    }
    public static int solve(int a, int b) {
        int add = a + b;
        int sub = a - b;
        int max = Math.max(add,sub);
        int multi = a * b;
        max = Math.max(max, multi);
        return max;
    }
}
