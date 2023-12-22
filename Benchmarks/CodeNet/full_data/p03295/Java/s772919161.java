import java.util.*;

// 区間スケジュール問題 貪欲法
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());

        int[][] arr = new int[M][2];
        for (int i = 0; i < M; i++) {
            arr[i][0] = Integer.parseInt(scanner.next());
            arr[i][1] = Integer.parseInt(scanner.next());
        }

        scanner.close();

        // 終点の昇順
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));

        int count = 0;
        int last = 0;
        for (int[] a : arr) {
            if (last <= a[0]) {
                last = a[1];
                count++;
            }
        }

        System.out.println(count);
    }
}
