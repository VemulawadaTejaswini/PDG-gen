import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int f = 0, c = 0;
        Queue<Integer> que = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("R")) {
                if (f == 1) {
                    f = 0;
                    que.add(c);
                    c = 0;
                }
                c++;
            } else {
                if (f == 0) {
                    f = 1;
                    que.add(c);
                    c = 0;
                }
                c++;
                if (i == s.length() - 1) {
                    que.add(c);
                }
            }
        }
        int ans[] = new int[s.length()];
        int pos = 0;
        while (que.size() > 0) {
            int x = que.poll();
            int y = que.poll();
            if ((x + y) % 2 == 0) {
                pos += x;
                ans[pos - 1] = (x + y) / 2;
                ans[pos] = (x + y) / 2;
                pos += y;
            } else if (x % 2 == 0) {
                pos += x;
                ans[pos - 1] = (x + y) / 2;
                ans[pos] = (x + y) / 2 + 1;
                pos += y;
            } else {
                pos += x;
                ans[pos - 1] = (x + y) / 2 + 1;
                ans[pos] = (x + y) / 2;
                pos += y;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (s.length() * 2 - 1); i++) {
            if (i % 2 == 0) {
                sb.append(ans[i / 2]);
            } else {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}