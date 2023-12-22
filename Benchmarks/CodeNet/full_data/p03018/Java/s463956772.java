import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        char[] array = s.toCharArray();
        long countA = 0;

        long result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 'A') {
                countA++;
            } else if (0 < countA) {
                if (array[i] == 'B' && array[i + 1] == 'C') {
                    result += countA;
                    i++;
                } else {
                    countA = 0;
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
