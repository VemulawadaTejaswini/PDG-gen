import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 1 || b == 1) {
            System.out.println(1);

        } else {
            List<Integer> primeFactor = new ArrayList<>();
            int target = gcd(a, b);
            for (int i = 2; i < target; i++) {
                if (target % i == 0) {
                    primeFactor.add(i);
                    target = target / i;
                    i = 2;
                }
            }
            primeFactor.add(target);

            System.out.println(new HashSet<>(primeFactor).size() + 1);
        }
    }

    public static int gcd(int a, int b) {
        int temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
