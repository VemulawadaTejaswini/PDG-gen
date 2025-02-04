import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int n;
    int m;
    int[] a;
    int total;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n+1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }
        sc.close();
        
        // 解答処理
        solve();
    }
    
    private void solve() {
        boolean res = true;
        a = sort(a, 1);
        for (int i = 0; i < m; i++) {
            if (total / (4 * m) > a[i]) {
                res = false;
                System.out.println("No");
                break;
            }
        }
        if (res) {
            System.out.println("Yes");
        }
}

        // 配列ソート(0:ASC 1:DESC)
        private int[] sort(int[] l, int flg) {
            ArrayList list = new ArrayList();
            for (int i = 0; i < l.length; i++) {
                list.add(l[i]);
            }
            // 昇順
            if(flg == 0) list.sort(Comparator.naturalOrder());
            // 降順
            if(flg == 1) list.sort(Comparator.reverseOrder());    
            for (int i = 0; i < list.size(); i++) {
                l[i] = (int)list.get(i);
            }
            return l;
        }
}