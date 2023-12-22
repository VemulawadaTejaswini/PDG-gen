import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        boolean[][] data = new boolean[h][w];

        for (int i=0; i < h; i++) {
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            for (int j=0; j < w; j++) {
                data[i][j] = ch[j] == '#';
            }
        }

        int c = 0;
        while (check(data)) {
            data = operate(data);
            c++;
        }

        System.out.println(c);
    }

    private static boolean[][] operate(boolean[][] data) {
        boolean[][] ret = new boolean[data.length][data[0].length];

        for (int i=0; i < data.length; i++) {
            for (int j=0; j < data[0].length; j++) {
                ret[i][j] = data[i][j];
            }
        }


        for (int i=0; i < data.length; i++) {
            for (int j=0; j < data[i].length; j++) {
                if (data[i][j]) {

                    if (i != data.length-1)
                        ret[i+1][j] = true;
                    if (i != 0)
                        ret[i-1][j] = true;
                    if (j != data[i].length-1)
                        ret[i][j+1] = true;
                    if (j != 0)
                        ret[i][j-1] = true;

                }
            }
        }

        return ret;
    }

    private static boolean check(boolean[][] data) {
        for (int i=0; i < data.length; i++) {
            for (int j=0; j < data[i].length; j++) {
                if (!data[i][j]) return true;
            }
        }

        return false;
    }


}
