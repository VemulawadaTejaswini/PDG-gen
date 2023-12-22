import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static char[] s;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        s = sc.next().toCharArray();

        for (int i = 1; i < s.length; i++) {
            if (s[i-1] == 'A' && s[i] == 'C') {
                list.add(i);
            }
        }

        V[] array = new V[q];
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt()-1;
            int r = sc.nextInt()-1;

            array[i] = new V(l, r, i);
        }

        Arrays.sort(array);

        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            int cnt = 0;
            int lr = array[i].l;
            int rl = array[i].r;
            for (int j = i; j >= 0; j--) {
                if (lr <= array[j].l && rl >= array[j].r) {
                    lr = array[j].l;
                    rl = array[j].r;
                    cnt += array[j].cnt;
                    cnt += counter(array[i].l, lr);
                    cnt += counter(rl, array[i].r);
                    break;
                }
            }

            if (cnt <= 0)
                cnt += counter(array[i].l, array[i].r);
            array[i].cnt = cnt;
            ans[array[i].i] = cnt;
        }

        for (int i : ans)
            System.out.println(i);
    }

    // lとrの間にあるACの個数を数えて返す
    static int counter(int l, int r) {
        int cnt = 0;
        for (int j = 0; j < list.size(); j++) {
            int num = list.get(j);
            if (num >= l+1 && num < r+1)
                cnt++;
        }

        return cnt;
    }

    static class V implements Comparable<V> {
        int l, r, diff, i, cnt;

        V (int l, int r, int i) {
            this.l = l;
            this.r = r;
            this.i = i;
            this.diff = r - l;
        }

        // diff の値でソート
        public int compareTo(V o) {
            return diff - o.diff;
        }
    }
}
