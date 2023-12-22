import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < w; j++) {
                list.get(i).add(sc.next());
            }
        }
        sc.close();

        // 主処理
        char column = 'A';
        int line = 1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if ("snuke".equals(list.get(i).get(j))) {
                    column = (char) ((int) column + j);
                    line += i;
                    break;
                }
            }
        }
        String result = column + Integer.toString(line);

        // 出力
        System.out.println(result);
    }
}
