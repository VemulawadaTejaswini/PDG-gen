
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 入力
        int n = sc.nextInt();
        char[][] input = new char[n][n];
        for (int i = 0; i < n; i++) {
            String iLine = sc.next();
            for (int j = 0; j < n; j++) {
                input[i][j] = iLine.charAt(j);
            }
        }
        int result = 1;

        if (checkEnd(input, n))
            result = 0;
        int maxColorCount = 0;
        List<Integer> maxIndexList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int colorCount = 0;
            for (int j = 0; j < n; j++)
                if (input[i][j] == '#')
                    colorCount++;
            if (maxColorCount < colorCount) {
                maxIndexList.clear();
                maxColorCount = colorCount;
                maxIndexList.add(i);
            } else if (maxColorCount == colorCount) {
                maxIndexList.add(i);
            }
        }
        if (maxColorCount == 0)
            result = -1;
        boolean coloredLine = false;
        int coloredIndex = maxIndexList.get(0);
        mi:
        for (int maxIndex : maxIndexList) {
            coloredLine = false;
            for (int j = 0; j < n; j++) {
                if (input[maxIndex][j] == '.') {
                    boolean notChanged = true;
                    for (int i = 0; i < n; i++) {
                        if (input[i][maxIndex] == '#') {
                            input = changeColor(input, i, j, n);
                            notChanged = false;
                            break;
                        }
                    }
                    if (notChanged) {
                        continue mi;
                    }
                }
            }
            coloredIndex = maxIndex;
            coloredLine = true;
            break;
        }
        if (!coloredLine) {
            count = n;
            for (int j = 0; j < n; j++)
                input[coloredIndex][j] = '#';
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (input[i][j] == '.') {
                    input = changeColor(input, coloredIndex, j, n);
                    break;
                }
            }
        }
        if (result > 0)
            result = count;
        System.out.println(result);
    }

    static boolean checkEnd(char[][] table, int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (table[i][j] == '.')
                    return false;
        return true;
    }

    static char[][] changeColor(char[][] table, int pi, int pj, int n) {
        char[][] newTable = table;
        char[] tmpColor = new char[n];
        for (int i = 0; i < n; i++)
            tmpColor[i] = table[pi][i];
        for (int j = 0; j < n; j++)
            newTable[j][pj] = tmpColor[j];
        count++;
        return newTable;
    }
}
