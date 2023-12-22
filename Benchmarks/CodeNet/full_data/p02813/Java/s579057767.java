import java.util.*;

public class Main {
    static ArrayList<Integer> list = new ArrayList<>();
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        makeNum(0, new boolean[n], 0);
        int p = 0;
        for (int i = 0; i < n; i++) {
            p *= 10;
            p += sc.nextInt();
        }
        int q = 0;
        for (int i = 0; i < n; i++) {
            q *= 10;
            q += sc.nextInt();
        }
        int a = getIdx(p);
        int b = getIdx(q);
        System.out.println(Math.abs(a - b));
    }
    
    static int getIdx(int x) {
        for (int i = 0; i < list.size(); i++) {
            if (x == list.get(i)) {
                return i + 1;
            }
        }
        return 0;
    }
    
    static void makeNum(int idx, boolean[] used, int value) {
        if (idx >= n) {
            list.add(value);
        }
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                used[i] = true;
                makeNum(idx + 1, used, value * 10 + i + 1);
                used[i] = false;
            }
        }
    }
}