import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> commonDivisor = new ArrayList<>();
        int max = a < b ? b : a;
        for (int i = 1; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                commonDivisor.add(i);
            }
        }

        int result = 1;
        for (int target : commonDivisor) {
            int count = 0;
            for (int i = 2; i <= target; i++) {
                if ((target % 2 > 0 && target % i == 0) || target == 2) {
                    count += 1;
                }
            }
            if (count == 1) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
