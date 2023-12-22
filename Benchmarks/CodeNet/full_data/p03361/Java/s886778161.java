import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.nextLine();
        char[][] chs = new char[a][b];
        for (int i = 0; i < a; i++) {
            chs[i] = in.nextLine().substring(0, b).toCharArray();
        }
        if (valid(chs)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean valid(char[][] chs) {
        int a = chs.length;
        int b = chs[0].length;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (chs[i][j] != '#') continue;
                if (j < b-1 && chs[i][j+1] == '#') continue;
                if (j > 0 && chs[i][j-1] == '#') continue;
                if (i < a-1 && chs[i+1][j] == '#') continue;
                if (i > 0 && chs[i-1][j] == '#') continue;
                return false;
            }
        }
        return true;
    }
}