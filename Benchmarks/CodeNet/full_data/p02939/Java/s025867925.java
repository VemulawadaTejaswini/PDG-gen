import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        String[] array = s.split("");

        List<String> list = new ArrayList<>();
        list.add(array[0]);

        String word = "";
        for (int i = 1; i < array.length; i++) {
            word += array[i];
            if (!word.equals(list.get(list.size() - 1))) {
                list.add(word);
                word = "";
            }
        }

        int result = list.size();

        // 出力
        System.out.println(result);
        sc.close();
    }
}
