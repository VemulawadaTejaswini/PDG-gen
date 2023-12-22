import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int happiness1 = 1000 * (X / 500);
        X %= 500;
        int happiness2 = 5 * (X / 5);

        System.out.println(happiness1 + happiness2);
    }
}
