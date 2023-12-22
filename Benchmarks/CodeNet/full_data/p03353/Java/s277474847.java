// 参考 -> #4669082

import java.util.Scanner;

public class ABC97_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String s = sc.next();
        int k = sc.nextInt();

        int cnt = 0;
        char target = 'a';
        while (cnt < k) {
            if (s.contains(sb.toString() + target)) {
                sb.append(target);
                cnt++;
                target = 'a';
                continue;
            }
            // ターゲットが見つからなかった場合
            if (target == 'z') {
                String tmp = sb.toString();
                target = tmp.charAt(tmp.length()-1);
                target++;
                sb.deleteCharAt(tmp.length()-1);
                continue;
            }
            target++;
        }

        System.out.println(sb.toString());
    }
}
