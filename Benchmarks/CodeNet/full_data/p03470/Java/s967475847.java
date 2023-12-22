import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] dArr = new Integer[n];

        for (int i = 0; i < n; i++) {
            dArr[i] = sc.nextInt();
        }

        // 降順に並べ替え
        Arrays.sort(dArr, Collections.reverseOrder());

        int count = 1;
        for (int i = 1; i < n; i++) {
            // 同じサイズだったら次へ
            if (dArr[i-1] == dArr[i]) continue;

            if (dArr[i-1] > dArr[i]) {
                count++;
            } else {
                // 降順にしているためないケース
                break;
            }
        }

        System.out.println(count);
    }
}
