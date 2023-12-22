import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }

        Arrays.sort(L);

        long ans = 0;
        for (int i = N-1; i >= 2; i--) {
            for (int j = i-1; j >= 1; j--) {
                int key = L[i] - L[j] + 1;
                int minIdx = search(L, key, j);
                if (minIdx < j) {
                    ans += j - minIdx;
                }
            }
        }
        System.out.println(ans);
    }

    private static int search(int[] L, int key, int right) {
        int left = -1;
        while (right - left > 1) {
            int mid = left + (right-left)/2;
            if (L[mid] >= key) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
}
