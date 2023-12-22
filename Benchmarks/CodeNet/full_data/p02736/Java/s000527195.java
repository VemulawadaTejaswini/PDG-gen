import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] results = new int[1 << (2 * 8)];
        for (int i = 0; i < (1 << (2 * 8)); i++) {
            int[] tmp = new int[8];
            int x = i;
            for (int j = 0; j < 8; j++) {
                tmp[j] = x % 4;
                x >>= 2;
            }
            for (int j = 0; j < 8 - 1; j++) {
                for (int k = 1; k < 8 - j; k++) {
                    tmp[k - 1] = Math.abs(tmp[k - 1] - tmp[k]);
                }
            }
            results[i] = tmp[0];
        }
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> next = new ArrayDeque<>();
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        for (int i = 0; i < n; i++) {
            queue.add(arr[i] - '0');
        }
        while (queue.size() > 8) {
            int x = 0;
            for (int i = 0; i < 8; i++) {
                x <<= 2;
                x += queue.poll();
            }
            next.add(results[x]);
            while (queue.size() > 0) {
                x %= 1 << (2 * 7);
                x <<= 2;
                x += queue.poll();
                next.add(results[x]);
            }
            ArrayDeque<Integer> tmp = next;
            next = queue;
            queue = tmp;
        }
        int length = queue.size();
        int[] ans = new int[length];
        for (int i = 0; i < length; i++) {
            ans[i] = queue.poll();
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = 1; j < length - i; j++) {
                ans[j - 1] = Math.abs(ans[j - 1] - ans[j]);
            }
        }
        System.out.println(ans[0]);
    }
}