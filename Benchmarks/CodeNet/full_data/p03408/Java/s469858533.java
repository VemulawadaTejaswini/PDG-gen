import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> blue = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            blue.add(sc.next());
        }

        int m = sc.nextInt();
        ArrayList<String> red = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            red.add(sc.next());
        }
        sc.close();

        Set<String> ts = new HashSet<>(blue);

        int ans = 0;

        for (String str : ts) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (str.equals(blue.get(i))) {
                    count++;
                }
            }
            for (int i = 0; i < m; i++) {
                if (str.equals(red.get(i))) {
                    count--;
                }
            }
            if (ans < count) {
                ans = count;
            }
        }
        System.out.println(ans);
    }
}