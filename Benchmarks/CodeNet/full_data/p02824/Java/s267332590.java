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
        // System.out.println(Arrays.toString(a));
        
        int ans = binaryLowerSearch() + 1;
        System.out.println(ans);
    }

    static int binaryLowerSearch() {
        int left = 0;
        int right = n;
        while(right - left > 1) {
            int mid = right - (right - left) / 2;
            // System.out.println("mid = " + mid);
            if(canMeetCondition(mid)) {
                // System.out.println("CAN MEET");
                left = mid;
            } else {
                // System.out.println("CANNOT MEET");
                right = mid;
            }
        }
        return left;
    }

    static boolean canMeetCondition(int index) {
        if(index < p) return true;
        if(a[index] + m < a[p - 1]) return false;

        long votes = 0;
        for(int i = 0; i < n; ++i) {
            if(i < p - 1) {
                votes += m;
            } else if(i < index) {
                votes += a[index] + m - a[i];
            } else {
                votes += m;
            }
        }
        return (votes >= 1L * m * v);
    }
}