import java.util.Scanner;

public class Main {
// Mainに書き換え！

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        while (true){
            boolean t = false;
            for (int i = 0; i < n; i++) {
                if(a[i] % 2 != 0) t = true;
            }
            if (t) break;
            for (int i = 0; i < n; i++) {
                a[i] /= 2;
            }
            ++ans;
        }
        // 出力
        System.out.println(Integer.toString(ans));
    }
}
