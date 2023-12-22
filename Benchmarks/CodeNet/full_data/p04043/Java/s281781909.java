import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] abc = {a, b, c};
        Arrays.sort(abc);

        boolean result = abc[0] == 5 && abc[1] == 5 && abc[2] == 7;

        System.out.println(result ? "YES" : "NO");
    }
}
