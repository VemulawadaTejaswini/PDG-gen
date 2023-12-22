import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] a = new char[h][w];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next().toCharArray();
        }
        sc.close();

        // 主処理
        List<char[]> list = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            if (new String(a[i]).replace(".", "").length() != 0) {
                list.add(a[i]);
            }
        }

        List<Integer> deleteIndexList = new ArrayList<>();
        for (int i = 0; i < w; i++) {
            boolean isDelete = true;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j)[i] == '#') {
                    isDelete = false;
                    break;
                }
            }
            if (isDelete) {
                deleteIndexList.add(i);
            }
        }

        String result = "";
        if (deleteIndexList.size() < w) {
            for (int i = 0; i < list.size(); i++) {
                String line = "";
                for (int j = 0; j < w; j++) {
                    if (!deleteIndexList.contains(j)) {
                        line += list.get(i)[j];
                    }
                }
                result += line + "\n";
            }

        } else {
            result = "\n";
        }

        // 出力
        System.out.print(result);
    }
}
