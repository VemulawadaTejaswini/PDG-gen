
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(collatz(s));
    }

    private static int collatz(int s) {

        Set<Integer> elems = new HashSet<>();

        int previous = s;
        int m = 1;

        while (!elems.contains(previous)) {
            elems.add(previous);
            previous = f(previous);
            m++;
        }
        return m;
    }

    private static int f(int s) {
        if (s % 2 == 0) return s / 2;
        else return (3 * s) + 1;
    }
}
