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
        List<Integer> skipIndexListX = new ArrayList<>();
        List<Integer> skipIndexListY = new ArrayList<>();

        for (int i = 0; i < h; i++) {
            boolean isSkipLine = true;
            for (int j = 0; j < w; j++) {
                if (a[i][j] == '#') {
                    isSkipLine = false;
                    break;
                }
            }
            if (isSkipLine) {
                skipIndexListY.add(i);
            }
        }

        for (int i = 0; i < w; i++) {
            boolean isSkipLine = true;
            for (int j = 0; j < h; j++) {
                if (a[j][i] == '#') {
                    isSkipLine = false;
                    break;
                }
            }
            if (isSkipLine) {
                skipIndexListX.add(i);
            }
        }

        List<String> lineList = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            if (!skipIndexListY.contains(i)) {
                String line = "";
                for (int j = 0; j < w; j++) {
                    if (!skipIndexListX.contains(j)) {
                        line += a[i][j];
                    }
                }
                if (0 < line.length()) {
                    lineList.add(line);
                }
            }
        }

        String result = String.join("\n", lineList);

        // 出力
        System.out.println(result);
    }
}
