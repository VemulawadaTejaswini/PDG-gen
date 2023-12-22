import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numArr = new int[count];

        for (int i = 0; i < count; i++) {
            numArr[i] = sc.nextInt();
        }

        Map<Integer, Integer> candidate = new HashMap<>();// 取りうる値と個数のMap
        for (int i = 0; i < count; i++) {
            int tmpKey = numArr[i];
            if (candidate.containsKey(tmpKey)) {
                candidate.put(tmpKey, candidate.get(tmpKey) + 1);
            } else {
                candidate.put(tmpKey, 1);
            }

            // +1
            int tmpKeyPlus1 = tmpKey + 1;
            if (candidate.containsKey(tmpKeyPlus1)) {
                candidate.put(tmpKeyPlus1, candidate.get(tmpKeyPlus1) + 1);
            } else {
                candidate.put(tmpKeyPlus1, 1);
            }

            // -1
            int tmpKeyMinus1 = tmpKey - 1;
            if (candidate.containsKey(tmpKeyMinus1)) {
                candidate.put(tmpKeyMinus1, candidate.get(tmpKeyMinus1) + 1);
            } else {
                candidate.put(tmpKeyMinus1, 1);
            }
        }

        // 最大化する値を探索
        int max = 0;
        int key = 0;
        for (Map.Entry<Integer, Integer> entry: candidate.entrySet()) {
            if (entry.getValue() > max) {
                key = entry.getKey();
                max = entry.getValue();
            }
        }

        int res = 0; // 操作後をした後のkeyのカウント
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == key) {
                res++;
            } else if (numArr[i] == key - 1 || numArr[i] == key + 1) {
                res++;
            }
        }

        System.out.println(res);
    }
}
