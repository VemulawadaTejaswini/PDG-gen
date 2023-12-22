import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(c);
        long count = 0;
        for(int i = 0; i < n; i++) {
            int num = b[i];
            long numsA = lowerBound(a, num);
            long numsC = n - upperBound(c, num);
            count += numsA * numsC;
        }
        System.out.println(count);
    }

    static long lowerBound(int[] a, int x) {
        int l = -1, r = a.length;
        while(r - l > 1) {
            int mid = (l + r) / 2;
            if(a[mid] >= x) r = mid;
            else l = mid;
        }
        return r;
    }

    static long upperBound(int[] a, int x) {
        int l = -1, r = a.length;
        while(r - l > 1) {
            int mid = (l + r) / 2;
            if(a[mid] <= x) l = mid;
            else r = mid;
        }
        return r;
    }
}
