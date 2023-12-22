import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

    public static int INF = Integer.MAX_VALUE / 4;

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = scanner.nextInt();
        }
        int ans = 0;
        for (int k = 1; k <= K; k++) {
            for (int l = 0; l <= k; l++) {
                List<Integer> list = new ArrayList<Integer>();
                int sum = 0;
                for (int a = 0; a < l; a++) {
                    list.add(V[a]);
                    sum += V[a];
                }
                for (int b = 0; b < k - l; b++) {
                    list.add(V[N - b - 1]);
                    sum += V[N - b - 1];
                }
                Collections.sort(list);
                int idx = 1;
                for (Integer integer : list) {
                    if (integer > 0 || idx + k > K) {
                        break;
                    }
                    sum -= integer;
                    idx++;
                }
                ans = Math.max(ans, sum);
            }
        }
        System.out.println(ans);
    }

}
