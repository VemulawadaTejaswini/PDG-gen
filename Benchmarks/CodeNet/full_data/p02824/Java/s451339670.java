import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = 0;
    static int m = 0;
    static int v = 0;
    static int p = 0;
    static Long[] a = null;

    public static void main(String[] args) {
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();
        p = sc.nextInt();
        a = new Long[n];
        for(int i = 0; i < n; ++i) a[i] = sc.nextLong();

        Arrays.sort(a, Comparator.reverseOrder());
        // Arrays.sort(a, Comparator.naturalOrder());
        // System.out.println(Arrays.toString(a));
        
        int ans = 0;
        for(int i = 0; i < n; ++i) {
            if(i <= p - 1) ++ans;
            else if(a[i] >= a[p - 1]) ++ans;
            else if(isPossibleUpperP(i)) ++ans;
            else break;
        }
        System.out.println(ans);
    }

    static boolean isPossibleUpperP(int index) {
        int tail = (index + v - 1 <= n - 1) ? index + v - 1 : n - 1;
        int head = (tail == index + v - 1) ? index : n - v;
        Long[] b = a.clone();
        for(int i = head; i <= tail; ++i) {
            b[i] += m;
        }

        Long key = b[index];
        Arrays.sort(b, Comparator.naturalOrder());
        // System.out.println("index = " + index + ", key = " + b[index]);
        // System.out.println(Arrays.toString(b));
        return (key >= b[p - 1]);
    }
}