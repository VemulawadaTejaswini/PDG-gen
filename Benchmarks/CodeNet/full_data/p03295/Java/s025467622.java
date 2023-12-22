import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] arr = new int[M][2];
        for (int i = 0; i < M; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int latest = 0;
        int cnt = 0;
        for (int i = 0; i < M; i++) {
            if (arr[i][0] >= latest) {
                latest = arr[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}