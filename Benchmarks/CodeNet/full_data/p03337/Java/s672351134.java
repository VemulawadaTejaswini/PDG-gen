import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] ans = { a + b, a - b, a * b };
        Arrays.sort(ans);
        System.out.println(ans[2]);
    }
}