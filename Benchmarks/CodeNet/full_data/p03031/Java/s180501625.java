import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int k[] = new int[m];
        for (int i = 0; i < m; i++) {
            StringBuilder s = new StringBuilder("0000000000".substring(0, n - 1));
            int x = Integer.parseInt(sc.next());
            for (int j = 0; j < x; j++) {
                int y = Integer.parseInt(sc.next());
                s.replace(y - 1, y, "1");
            }
            k[i] = Integer.parseInt(s.toString(), 2);
        }
        int p[] = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int ans = 0;
        for (int i = 0; i < Math.pow(2, n); i++) {
            int f = 1;
            for (int j = 0; j < m; j++) {
                String bin = Integer.toBinaryString(i & k[j]);
                int c = 0;
                for (int v = 0; v < bin.length(); v++) {
                    if (bin.substring(v, v + 1).equals("1")) {
                        c++;
                    }
                }
                if (c % 2 != p[j]) {
                    f = 0;
                    break;
                }
            }
            ans += f;
        }
        System.out.println(ans);
    }
}