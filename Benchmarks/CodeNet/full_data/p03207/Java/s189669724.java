import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(p);

        p.add(p.remove(n - 1) / 2);
        int ans = p.stream().mapToInt(e -> e).sum();
        System.out.println(ans);
    }

}
