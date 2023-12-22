import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Long> set = new TreeSet<>();
        for(int i = 0; i < n; i++) {
            set.add(sc.nextLong());
        }
        while(set.size() >= 2) {
            long a = set.pollFirst();
            long b = set.pollFirst();
            if(b % a > 0) {
                set.add(b % a);
            }
            set.add(a);
        }
        System.out.println(set.first());
    }
}
