import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        int aTotal = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a.add(x);
            aTotal += x;
        }
        List<Integer> b = new ArrayList<>();
        int bTotal = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            b.add(x);
            bTotal += x;
        }

        if (aTotal < bTotal) {
            System.out.println(-1);
            return;
        }
        List<Integer> sub = new ArrayList<>();
        int cnt = 0;
        int minusTotal = 0;
        for (int i = 0; i < n; i++) {
            int s = a.get(i) - b.get(i);
            if (s < 0) {
                cnt++;
                minusTotal += s;
            }
            sub.add(s);
        }
        if (cnt == 0) {
            System.out.println(0);
            return;
        }
        Collections.sort(sub,Comparator.reverseOrder());

        boolean ok = false;
        for (int i : sub) {
            if (i < 0) {
                continue;
            }
            minusTotal += i;
            cnt++;
            if (minusTotal >= 0) {
                ok = true;
                break;
            }
        }
        if (!ok) {
            System.out.println(-1);
            return;
        }
        System.out.println(cnt);
    }
}
