import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        Set<Integer> adiv = divisor(a);
        Set<Integer> bdiv = divisor(b);

        List<Integer> bothDivisor = new ArrayList<>();
        // サイズ長が大きい方を使う
        for (Integer ad : adiv.size() > bdiv.size() ? adiv : bdiv) {
            if (bdiv.contains(ad)) {
                bothDivisor.add(ad);
            }
        }

        System.out.println(bothDivisor.get(k - 1));
    }

    static Set<Integer> divisor(int n) {
        Set<Integer> ret = new HashSet<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                ret.add(i);
                if (i != n / i)
                    ret.add(n / i);
            }
        }
        return ret;
    }
}
