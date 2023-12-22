import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long x = in.nextLong();
        long result = 0;
        if (a % x == 0) {
            result = (b / x) - (a / x) + 1;
        } else {
            result = (b / x) - (a / x);
        }
        System.out.println(result);
    }
}