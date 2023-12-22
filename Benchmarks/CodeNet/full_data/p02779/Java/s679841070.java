import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<Long> a = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Long aa = sc.nextLong();
            a.add(aa);
        }

        String result = "YES";
        if (a.size() != n) {
            result = "NO";
        }

        System.out.println(result);
    }
}