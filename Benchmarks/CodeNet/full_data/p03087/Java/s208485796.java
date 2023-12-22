import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        String[] str = s.split("");
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        List<Integer> ac = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            l.add(sc.nextInt());
            r.add(sc.nextInt());
        }

        for (int i = 0; i < n - 1; i++) {
            if ("A".equals(str[i]) && "C".equals(str[i + 1])) {
                if (i == 0) {
                    ac.add(1);
                } else {
                    ac.add(ac.get(i - 1) + 1);
                }
            } else {
                if (i == 0) {
                    ac.add(0);
                } else {
                    ac.add(ac.get(i - 1));
                }
            }
        }
        for (int i = 0; i < q; i++) {
            int start = l.get(i);
            int end = r.get(i);
            if (start == 1) {
                System.out.println(ac.get(end - 2));
            } else {
                System.out.println(ac.get(end - 2) - ac.get(start - 2));
            }
        }
    }

}
