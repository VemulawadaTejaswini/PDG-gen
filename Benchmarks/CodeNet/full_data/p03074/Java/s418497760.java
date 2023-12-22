

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        List<Integer> list = new ArrayList<>();
        if (s.charAt(0) == '0') {
            list.add(0);
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
            } else {
                list.add(cnt);
                cnt = 1;
            }
        }
        list.add(cnt);
        if (list.size() % 2 == 0) {
            list.add(0);
        }
        int ans = 0;
        int num = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < list.size(); i += 2) {
            int nextLeft = i;
            int nextRight = Math.min(i + k * 2 + 1, list.size());
            while (nextLeft > left) {
                num -= list.get(left);
                left++;
            }
            while (nextRight > right) {
                num += list.get(right);
                right++;
            }
            ans = Math.max(ans, num);
        }

        System.out.println(ans);
    }
}
