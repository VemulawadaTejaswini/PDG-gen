import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            x.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(x);

        int diff = m - n;
        if (diff <= 0) {
            System.out.println(0);
        } else {
            List<Integer> diffList = new ArrayList<>();
            for (int i = 1; i < m; i++) {
                diffList.add(x.get(i) - x.get(i - 1));
            }
            Collections.sort(diffList);

            int ans = 0;
            for (int i = 0; i < diff; i++) {
                ans += diffList.get(i);
            }
            System.out.println(ans);
        }

    }

}
