import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(calculation(N));
    }

    private static int calculation(int N) {
        return N * (N + 1) / 2;
    }
}
