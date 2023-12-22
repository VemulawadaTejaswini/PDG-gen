import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long[] sums = new long[n + 1]; 
        sums[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sums[i] = arr[i] + sums[i + 1];
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[n - 1 - i], i + 1);
        }
        map.put(Integer.MAX_VALUE, 0);
        int left = 0;
        int right = 200000;
        while (right - left > 1) {
            int mm = (left + right) / 2;
            if (getCount(mm, arr, map) >= m) {
                left = mm;
            } else {
                right = mm;
            }
        }
        long count = 0;
        long total = 0;
        for (int i = 0; i < n; i++) {
            Map.Entry<Integer, Integer> entry = map.ceilingEntry(left - arr[i]);
            count += entry.getValue();
            total += sums[n - entry.getValue()] + arr[i] * entry.getValue();
        }
        total -= (count - m) * left;
        System.out.println(total);
    }
    
    static long getCount(int m, int[] arr, TreeMap<Integer, Integer> map) {
        long count = 0;
        for (int i = 0; i < arr.length; i++) {
            Map.Entry<Integer, Integer> entry = map.ceilingEntry(m - arr[i]);
            count += entry.getValue();
        }
        return count;
    }
}
