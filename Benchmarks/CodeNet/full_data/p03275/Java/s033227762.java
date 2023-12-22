import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i=0;i<N;i++) arr[i] = scan.nextInt();
        Task tsk = new Task();
        System.out.println(tsk.solve(arr));
    }

    static class Task{
        public int solve(int[] arr){
            int n = arr.length;
            long total = n* (n-1) / 2 + n;
            int[] sorted = Arrays.copyOf(arr, n);
            Arrays.sort(sorted);
            int l = 0, r = n-1;
            while (l < r) {
                int mid = l + (r-l)/2;
                int target = sorted[mid];

                int se = 0;
                long cnt = 0;
                int[] bit = new int[2*n+2];
                for (int i=0;i<n;i++) {
                    se += arr[i] <= target? 1: -1;
                    for (int x=se+n+1;x<bit.length;x+=x&-x) bit[x]++;
                    for (int x=se+n;x>0;x-=x&-x) cnt += bit[x];
                }
                if (cnt >= total/2 + 1) r = mid;
                else l = mid+1;
            }
            return sorted[l];
        }
    }
}
