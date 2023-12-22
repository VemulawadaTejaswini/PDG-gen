import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer N = Integer.parseInt(sc.nextLine());
        String[] VN = sc.nextLine().split(" ");

        // 重複を混ぜると価値が下がるのでセットで保持る
        Set<Long> valueSet = new TreeSet<>();
        for (String v : VN) {
            long vi = Long.parseLong(v);
            valueSet.add(vi);
        }

        // 貪欲法で解いていく
        double ans = mix(valueSet);
        System.out.println(ans);
    }

    private static double mix(Set<Long> valueSet) {
        if (valueSet.size() == 1) {
            for (Long v : valueSet) {
                return v;
            }
        }

        double tmp = 0d;
        for (Long val : valueSet) {
            if (tmp == 0) {
                tmp += (double) val;
            } else {
                tmp = mixIn(tmp, val);
            }
        }
        return tmp;
    }

    private static double mixIn(double tmp, Long val) {
        return (tmp + val) / 2;
    }
}
