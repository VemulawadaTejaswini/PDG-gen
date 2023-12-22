import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), a = sc.nextLong(), b = sc.nextLong();

        if (n < a) {
            System.out.println(n);
            return;
        }
        if (a == 0) {
            System.out.println(0);
            return;
        }

        List<String> list = new ArrayList<>();
        boolean isA = true;
        int count = 0;
        for (long i = 0; i < n; i++) {
            if (isA) {
                list.add("b");
                count++;
                if (count == a) {
                    isA = false;
                    count = 0;
                }
            } else {
                list.add("r");
                count++;
                if (count == b) {
                    isA = true;
                    count = 0;
                }
            }
        }

        System.out.println(list.stream().filter(s -> s.equals("b")).count());
    }
}
