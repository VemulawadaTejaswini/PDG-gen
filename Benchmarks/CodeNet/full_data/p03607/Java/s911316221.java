import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lyc on 2017/10/12.
 */
class Main {
    public static void main(String[] strings) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Set<Integer> set = new HashSet<>();

        while (N-- != 0) {
            int su = scanner.nextInt();
            if (!set.contains(su)) {
                set.add(su);
            }else {
                set.remove(su);
            }
        }
        System.out.print(set.size());
    }
}
