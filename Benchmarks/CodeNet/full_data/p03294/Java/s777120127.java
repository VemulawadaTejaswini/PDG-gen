import java.util.*;
public class Main {
    static long lcm(int[] arr, int n, int maxval) {
        long res = 1l;
        int x = 2;
        while (x <= maxval) {
            List<Integer> list = new ArrayList<>();
            for (int i=0; i<n; i++) {
                if (arr[i] % x == 0) {
                    list.add(i);
                }
            }
            if (list.size() >= 2) {
                for (int j=0; j<list.size(); j++)
                    arr[list.get(j)] = arr[list.get(j)]/x;
    
                res = res * x;
            }
            else
                x++;
        }
        for (int i=0; i<n; i++) res = res*arr[i];
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int maxval = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            arr1[i] = arr[i];
            maxval = Math.max(maxval, arr[i]);
        }
        long lc = lcm(arr, n, maxval) - 1;
        //System.out.println(lc+1);
        long ans = 0l;
        for (int i : arr1) {
            ans += (lc % i);
        }
        System.out.println(ans);
    }
}