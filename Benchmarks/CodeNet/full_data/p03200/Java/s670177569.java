import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        List<Integer> set = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'B') set.add(i);
        }
        int countB = set.size();
        if (n == countB || 0 == countB) {
            System.out.println(0);
        }

        int l = 0;
        int r = n - 1;
        int count = 0;
        while (l <= r) {
            // 左からBを見つける
            while (l < n && s.charAt(l) != 'B') {
                l++;
            }
            // 右からWを
            while (r >= 0 && s.charAt(r) != 'W') {
                r--;
            }
            if (l >= r) {
                break;
            }

            count += r - l;
            l++;
            r--;
        }
        System.out.println(count);
    }
}