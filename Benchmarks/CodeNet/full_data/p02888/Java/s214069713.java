import java.util.*;

public class Main {
    public static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        long ans = 0L;
        Arrays.sort(a);
        // System.out.println(Arrays.toString(a));
        for (int i=0;i<N;i++) {
            for (int j=i+1;j<N;j++) {
                ans += binary_search(a[i]+a[j])-j-1;
                // System.out.println("N: " + N + "binary: " + (binary_search(a[i]+a[j])-j-1));
                // ans += N;
            }
        }
        System.out.println(ans);
    }
    public static boolean isOK(int index, int key) {
        if (a[index] >= key) return true;
        else return false;
    }

    public static int binary_search(int key) {
        int left = -1;
        int right = a.length;

        while (right - left > 1) {
            int mid = left + (right - left) / 2;

            if (isOK(mid, key)) right = mid;
            else left = mid;
        }
        return right;
    }
}
