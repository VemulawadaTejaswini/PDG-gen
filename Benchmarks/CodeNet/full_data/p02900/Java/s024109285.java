import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();

        if (a == 1 || b == 1) {
            System.out.println(1);

        } else {
            List<Integer> primeFactor = new ArrayList<>();
            Long target = gcd(a, b);
            for (int i = 2; i < target; i++) {
                if (target % i == 0 && !primeFactor.contains(i)) {
                    primeFactor.add(i);
                    target /= i;
                    i = 2;
                }
            }
            int x = Integer.parseInt(target.toString());
            if (!primeFactor.contains(x)) {
                primeFactor.add(x);
            }

            System.out.println(primeFactor.size() + 1);
        }
    }

    // 最大公約数を返す
    public static Long gcd(Long a, Long b) {
        Long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
