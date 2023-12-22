import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        char[] array = s.toCharArray();
        boolean[] isUsed = new boolean[100];
        int[] count = new int[10000];
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int num = ((int) array[i] - 48) * 10 + ((int) array[j] - 48);
                if (isUsed[num]) {
                    continue;
                }
                isUsed[num] = true;

                int index = j + 1;
                StringBuilder sb = new StringBuilder(s);
                int[] countArray = calcCountArray(sb.substring(index).toString());

                for (int k = 0; k < 10; k++) {
                    if (countArray[k] == 1) {
                        count[num * 10 + k] = 1;
                    }
                }
            }
        }
        int sum = Arrays.stream(count).sum();
        int result = sum;

        // 出力
        System.out.println(result);
    }

    public static int[] calcCountArray(String s) {
        int[] count = new int[10];
        if (s.contains("0")) {
            count[0]++;
        }
        if (s.contains("1")) {
            count[1]++;
        }
        if (s.contains("2")) {
            count[2]++;
        }
        if (s.contains("3")) {
            count[3]++;
        }
        if (s.contains("4")) {
            count[4]++;
        }
        if (s.contains("5")) {
            count[5]++;
        }
        if (s.contains("6")) {
            count[6]++;
        }
        if (s.contains("7")) {
            count[7]++;
        }
        if (s.contains("8")) {
            count[8]++;
        }
        if (s.contains("9")) {
            count[9]++;
        }
        return count;
    }
}
