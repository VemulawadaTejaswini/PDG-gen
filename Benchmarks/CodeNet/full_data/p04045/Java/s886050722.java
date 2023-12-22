import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            d.add(sc.nextInt());
        }

        // nを配列にする
        String[] strN = Integer.toString(n).split("");
        int[] arrN = new int[strN.length];
        for (int i = 0; i < strN.length; i++) {
            arrN[i] = Integer.parseInt(strN[i]);
        }

        // 使用可能な数字
        List<Integer> useNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (!d.contains(i)) {
                useNumber.add(i);
            }
        }

        // 最上位桁を求める
        String[] result = new String[arrN.length];
        for (int i = 0; i < useNumber.size(); i++) {
            if (arrN[0] <= useNumber.get(i)) {
                result[0] = Integer.toString(useNumber.get(i));
                break;
            }
        }

        // 第二位桁以降を求める
        if (arrN[0] == Integer.parseInt(result[0])) {
            for (int i = 1; i < result.length; i++) {
                int min = 9;
                for (int j = 1; j < useNumber.size(); j++) {
                    if (arrN[i] <= useNumber.get(j) && min >= useNumber.get(j)) {
                        min = useNumber.get(j);
                    }
                }
                result[i] = Integer.toString(min);
            }
        } else {
            for (int j = 1; j < result.length; j++) {
                result[j] = Integer.toString(useNumber.get(0));
            }
        }

        System.out.println(String.join("", result));
    }
}
