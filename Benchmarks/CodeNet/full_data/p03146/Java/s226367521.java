import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int s = sc.nextInt();

        List<Integer> l = new ArrayList<>();
        l.add(s);
        
        int idx = 0;
        while (true) {
            int a = f(l.get(idx));
            if (l.contains(a)) {
                System.out.println(idx+2);
                break;
            }
            l.add(a);
            idx++;
        }
    }

    private static int f(final int n) {
        return n % 2 == 0 ? n / 2 : 3 * n + 1;
    }
}
