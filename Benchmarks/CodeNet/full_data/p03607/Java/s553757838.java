import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (set.contains(a)) {
                set.remove(a);
            } else {
                set.add(a);
            }
        }
        System.out.println(set.size());
    }
}