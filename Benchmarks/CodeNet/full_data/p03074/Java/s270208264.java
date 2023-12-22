import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int cnt = 1;
        char c = s.charAt(0);
        List<Integer> list = new ArrayList<>();
        if (c == '0') {
            list.add(0);
        }
        for (int i = 1; i < n; i++) {
            char tmp = s.charAt(i);
            if (c == tmp) {
                cnt++;
                continue;
            }
            list.add(cnt);
            cnt = 1;
            c = tmp;
        }
        list.add(cnt);
        int size = list.size();
        long ar[] = new long[size];
        for (int i = 0; i < size; i++) {
            ar[i] = list.get(i);
        }
        for (int i = 1; i < size; i++) {
            ar[i] += ar[i - 1];
        }
        long ans = ar[Math.min(size - 1, k * 2)];
        for (int r = k * 2 + 2; r < size; r += 2) {
            long tmp = ar[r] - ar[r - (k * 2 + 1)];
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
        sc.close();

    }
}
