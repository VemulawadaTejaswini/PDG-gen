import java.util.*;

public class Main {

    static final String[] NUMS = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        char[] array = s.toCharArray();
        int[] count = new int[100];
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int num = ((int) array[i] - 48) * 10 + ((int) array[j] - 48);
                if (0 < count[num]) {
                    continue;
                }

                int index = j + 1;
                count[num] += calcCount(new StringBuilder(s).substring(index).toString());
            }
        }
        int sum = Arrays.stream(count).sum();
        int result = sum;

        // 出力
        System.out.println(result);
    }

    public static int calcCount(String s) {
        int count = 0;
        for (String num : NUMS) {
            if (s.contains(num)) {
                count++;
            }
        }
        return count;
    }
}
