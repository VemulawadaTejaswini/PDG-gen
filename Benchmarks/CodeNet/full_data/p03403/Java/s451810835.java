import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));

        // 主処理
        String[] array = new String[n];
        boolean isStart = true;
        for (int i = 0; i < a.length; i++) {
            int price = 0;
            int pre = 0;
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    if (isStart) {
                        price += Math.abs(a[j]);
                        pre = a[j];
                        isStart = false;
                    } else {
                        price += Math.abs(pre - a[j]);
                        pre = a[j];
                    }
                }
            }
            price += Math.abs(pre);
            array[i] = Integer.toString(price);
            isStart = true;
        }

        String result = String.join("\n", array);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
