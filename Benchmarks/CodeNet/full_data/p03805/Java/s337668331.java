import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 0;

    List<Integer>[] lists = new ArrayList[n];

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<n; i++) lists[i] = new ArrayList<>();

        int m = sc.nextInt();
        for (int i=0; i<m; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            lists[s].add(t);
            lists[t].add(s);
        }

        dfs("", n);

        System.out.println(cnt);

    }

    void dfs(String s, int n) {

        if (s.length() == n) {
//            System.out.println(s);
            if (s.charAt(0) == '0') {
                boolean check = true;
                for (int i=0; i<s.length()-1; i++) {
                    if (!lists[s.charAt(i) - 48].contains(s.charAt(i+1) - 48)) {
                        check = false;
                        break;
                    }
                }
                if (check) cnt++;
            }

        } else {
            for (int i=0; i<n; i++) {
                if (s.contains(String.valueOf(i))) continue;
                dfs(s + i, n);
            }
        }
    }


}

