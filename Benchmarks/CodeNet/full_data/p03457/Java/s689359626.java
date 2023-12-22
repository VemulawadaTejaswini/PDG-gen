
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> t = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        t.add(0);
        x.add(0);
        y.add(0);
        for (int i = 0; i < n; i++) {
            t.add(sc.nextInt());
            x.add(sc.nextInt());
            y.add(sc.nextInt());
        }

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            int dt = t.get(i+1) - t.get(i);
            int dist = Math.abs(x.get(i+1) - x.get(i)) + Math.abs(y.get(i+1) - y.get(i));
            if (dist > dt) {
                flag = false;
            }
            if (dt%2 != dist%2) {
                flag = false;
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}