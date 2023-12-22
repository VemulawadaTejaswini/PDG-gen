import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner itr = new Scanner(System.in);
        int X = itr.nextInt();

        int res = 0;
        res += 1000 * (X / 500);
        X = X % 500;
        res += 5 * (X / 5);

        System.out.println(res);

    }
}
