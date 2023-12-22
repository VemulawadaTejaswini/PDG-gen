import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        int r = 0;
        int g = 0;
        int b = 0;
//        for (int i = 0; i < c.length; i++) {
//            if (c[i] == 'R') r++;
//            if (c[i] == 'G') g++;
//            if (c[i] == 'B') b++;
//        }
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'R') r++;
            if (c == 'G') g++;
            if (c == 'B') b++;
        }

        //総数
        long ans = r*g*b;

        //(i,j,k)の中でiの位置を固定する。
        for (int st = 0; st < n - 2; st++) {
            //(i,j,k)の中でjの位置を固定する。つまりkの位置を決まる。
            for (int dist = 1; st + dist * 2 < n; dist++) {
                char si = s.charAt(st);
                char sj = s.charAt(st + dist);
                char sk = s.charAt(st + dist * 2);
                if (si != sj && sj != sk && sk != si)
                    ans--;
//                char i = c[st];
//                char j = c[st + dist];
//                char k = c[st + dist * 2];
//                if (i != j && j != k && i != k) ans--;
            }
        }
        System.out.println(ans);
    }
}
