import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 * AtCoder Beginner Contest 1xx
 * <p>
 * https://atcoder.jp/contests/abc1xx/tasks/abc1xx_c
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder bf = new StringBuilder(sc.next());
        sc.nextLine();
        int q = sc.nextInt();
        boolean reverse = false;
        List<String> addBeggining = new ArrayList<>();
        List<String> addEnd = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            sc.nextLine();
            int t = sc.nextInt();
            if (t == 1) {
                reverse = !reverse;
            } else {
                int f = sc.nextInt();
                if (f == 1) {
                    if (!reverse) {
                        addBeggining.add(sc.next());
                    } else {
                        addEnd.add(sc.next());
                    }
                } else {
                    if (!reverse) {
                        addEnd.add(sc.next());
                    } else {
                        addBeggining.add(sc.next());
                    }
                }
            }
        }
        String str;
        if (!reverse) {
            str = bf.toString();
            System.out.println(join(addBeggining, true) + str + join(addEnd, false));
        } else {
            str = bf.reverse().toString();
            System.out.println(join(addEnd, true) + str + join(addBeggining, false));
        }
    }
    private static String join(List<String> list, boolean isReverse) {
        StringBuilder sb = new StringBuilder();
        if (!isReverse) {
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
            }
        } else {
            for (int i = list.size() - 1; i >= 0; i--) {
                sb.append(list.get(i));
            }
        }
        return sb.toString();
    }
}
