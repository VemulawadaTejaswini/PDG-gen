import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> div1 = divisor(a);
        List<Integer> div2 = divisor(b);

        int times = 1;
        for (Integer d1 : div1) {
            if (div2.contains(d1) && d1 != 1) {
                times = d1;
                break;
            }
        }

        long tmp = (long) a * b;
        System.out.println((long) tmp / times);
    }

    static List<Integer> divisor(int n) {
        Set<Integer> ret = new HashSet<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ret.add(i);
                if (i != n / i)
                    ret.add(n / i);
            }
        }
        return ret.stream().sorted().collect(Collectors.toList());
    }
}
