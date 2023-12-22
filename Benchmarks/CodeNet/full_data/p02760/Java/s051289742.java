import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list[][] = new int[3][3]; // 3*3の二次元配列
        // 二次元配列に値を格納
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list[i][j] = Integer.parseInt(sc.next());
            }
        }
        int n = Integer.parseInt(sc.next());
        for (int i = 0, num = 0; i < n; i++) {
            // bの値
            num = Integer.parseInt(sc.next());
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    // bと一致する値が二次元配列に存在する場合
                    if (list[j][k] == num) {
                        // 該当箇所を0に更新(当たりとして扱う)
                        list[j][k] = 0;
                    }
                }
            }
        }
        // 縦横斜め列のいずれか一列の要素が全て0の場合、ビンゴ達成
        if (checkBingoVertical(list) ||
                checkBingoParallel(list) ||
                checkBingoLeftUpToRightDown(list) ||
                checkBingoRightUpToLeftDown(list)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }

    private static HashSet<Integer> hs = new HashSet<>();

    // ビンゴの縦列
    private static boolean checkBingoVertical(int[][] plist) {
        int verticalsize = plist.length;
        int parallelsize = plist[0].length;
        //HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < verticalsize; i++) {
            hs.clear();
            hs.add(plist[0][i]);
            for (int j = 0; j < parallelsize; j++) {
                hs.add(plist[j][i]);
            }
            if (hs.size() == 1) {
                return true;
            }
        }
        return false;
    }

    // ビンゴの横列
    private static boolean checkBingoParallel(int[][] plist) {
        int verticalsize = plist.length;
        int parallelsize = plist[0].length;
        //HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < verticalsize; i++) {
            hs.clear();
            hs.add(plist[i][0]);
            for (int j = 0; j < parallelsize; j++) {
                hs.add(plist[i][j]);
            }
            if (hs.size() == 1) {
                return true;
            }
        }
        return false;
    }

    // ビンゴの斜め列(＼：左上から右下)
    private static boolean checkBingoLeftUpToRightDown(int[][] plist) {
        //HashSet<Integer> hs = new HashSet<>();
        hs.clear();
        for (int i = 0, size = plist.length; i < size; i++) {
            hs.add(plist[i][i]);
        }
        // 1列全て0ならば、HashSetの要素は0のみ格納される
        if (hs.size() == 1) {
            return true;
        }
        return false;
    }

    // ビンゴの斜め列(／：右上から左下)
    private static boolean checkBingoRightUpToLeftDown(int[][] plist) {
        //HashSet<Integer> hs = new HashSet<>();
        hs.clear();
        for (int i = 0, size = plist.length; i < size; i++) {
            hs.add(plist[i][size - 1 - i]);
        }
        if (hs.size() == 1) {
            return true;
        }
        return false;
    }

}
