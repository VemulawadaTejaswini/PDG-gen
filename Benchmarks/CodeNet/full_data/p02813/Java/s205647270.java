import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] p = new Integer[n];
        Integer[] q = new Integer[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < n; i++) {
            q[i] = Integer.parseInt(sc.next());
        }
        Integer[] aa = new Integer[n];
        for (int i = 0; i < n; i++) {
            aa[i] = i + 1;
        }
        List<Integer[]> list = new ArrayList<>();
        Permutation perm = new Permutation();
        perm.rec(list, aa, new Integer[aa.length], 0);
        int a = 0;
        int b = 0;
        s: for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < n; j++) {
                if (list.get(i)[j] != p[j]) {
                    continue s;
                }
            }
            a = i;
            break;
        }
        s: for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < n; j++) {
                if (list.get(i)[j] != q[j]) {
                    continue s;
                }
            }
            b = i;
            break;
        }
        System.out.println(Math.abs(a - b));

    }

    private static class Permutation {

        public <T> void rec(List<T[]> list, T[] array, T[] ans, int index) {
            if (isEnd(array)) {
                list.add(ans.clone());
            } else {
                for (int i = 0; i < array.length; ++i) {
                    T o = array[i];
                    if (o == null) {
                        continue;
                    }
                    array[i] = null;
                    ans[index] = o;
                    rec(list, array, ans, index + 1);
                    ans[index] = null;
                    array[i] = o;
                }
            }
        }

        private <T> boolean isEnd(T[] array) {
            for (T o : array) {
                if (o != null) {
                    return false;
                }
            }
            return true;
        }
    }
}