import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        sc.close();

        // 主処理
        String[] array = new String[n];
        final int CENTER = (n - 1) / 2;
        for (int i = 0; i < n; i++) {
            List<String> numList = new ArrayList<>();
            numList.addAll(list);
            String removeNum = numList.get(i);
            numList.remove(numList.indexOf(removeNum));
            Collections.sort(numList);
            array[i] = numList.get(CENTER);
        }
        String result = String.join("\n", array);

        // 出力
        System.out.println(result);
    }
}
