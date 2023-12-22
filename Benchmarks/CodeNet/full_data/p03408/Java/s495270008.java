
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(sc.next());
        }

        int m = sc.nextInt();
        List<String> t = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            t.add(sc.next());
        }

        long max = 0;
        Set<String> set = new HashSet<>(s);
        for (String str: set) {
            long blue = s.stream().filter(a -> a.equals(str)).count();
            long red = t.stream().filter(a -> a.equals(str)).count();
            if ((blue-red) > max) max = blue-red;
        }
        System.out.println(max);
        sc.close();
    }

}
