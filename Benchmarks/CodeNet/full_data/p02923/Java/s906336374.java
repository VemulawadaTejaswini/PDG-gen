import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int before = sc.nextInt();
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < n; i++) {
            int now = sc.nextInt();
            if (now <= before) {
                count++;
            } else {
                set.add(count);
                count = 0;
            }
            before = now;
        }
        set.add(count);
        System.out.println(set.stream().mapToInt(m -> m).max().getAsInt());
    }
}
