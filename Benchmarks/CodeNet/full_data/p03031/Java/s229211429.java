import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, M;
        N = in.nextInt();
        M = in.nextInt();
        int[] k = new int[M];
        int[] p = new int[M];
        ArrayList<Integer>[] s = new ArrayList[M];
        for (int i = 0; i < M; i++) {
            s[i] = new ArrayList<>();
            k[i] = in.nextInt();
            for (int j = 0; j < k[i]; j++) {
                s[i].add(in.nextInt() - 1);
            }
        }
        for (int i = 0; i < M; i++) {
            p[i] = in.nextInt();
        }
        int[] sw = new int[N];
        int ans = solve(s, sw, p, 0);
        System.out.println(ans);
    }

    static int solve(ArrayList<Integer>[] s, int[] sw, int[] p, int index) {
        //index番目までのスイッチのon/offを列挙してしらべる
        if (index >= sw.length) {//最後のスイッチまで列挙したら判定
            return isLightenAll(s, sw, p) ? 1 : 0;
        }
        int ret = 0;
        //まだ列挙し終わっていないならindex番目を列挙して次へ
        for (int i = 0; i <= 1; i++) {//off=0, on=1
            int[] nextSw = Arrays.copyOf(sw, sw.length);
            nextSw[index] = i;
            ret += solve(s, nextSw, p, index + 1);
        }
        return ret;
    }

    static boolean isLightenAll(ArrayList<Integer>[] s, int[] sw, int[] p) {
        for (int i = 0; i < s.length; i++) {
            if (!isLighten(s[i], sw, p[i])) {
                return false;
            }
        }
        return true;
    }

    static boolean isLighten(ArrayList<Integer> s, int[] sw, int p) {
        //swの
        //s.get(0) ~ s.get(s.size()-1)番目の値の和 % 2 == p
        //ならばtrue
        int sum = 0;
        for (int si : s) {
            sum += sw[si];
        }
        return sum % 2 == p;
    }
}
