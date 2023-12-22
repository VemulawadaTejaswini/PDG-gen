import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
            b.add(sc.nextInt());
        }

        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            int aIndex = a.get(i) + cnt;
            if (b.get(i) == 1) {
                continue;
            }
            cnt += b.get(i) - aIndex % b.get(i);
        }
        System.out.println(cnt);
    }
}
