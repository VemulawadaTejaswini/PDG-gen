import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int h = kbd.nextInt();
        int w = kbd.nextInt();
        String[][] bord = new String[h][w];
        for (int i = 0; i < h; i++) {
            String str = kbd.next();
            String[] temp = str.split("");
            for (int j = 0; j < w; j++) {
                bord[i][j] = temp[j];
            }
        }
        int count = 0;
        while (job(bord)) {
            count++;
        }
        System.out.println(count);
    }

    static boolean job(String[][] bord) {
        boolean flagChange = false;
        String[][] copy = new String[bord.length][];
        for (int n = 0; n < bord.length; n++) {
            copy[n] = bord[n].clone();
        }
        for (int i = 0; i < bord.length; i++) {
            if (!Arrays.asList(copy).contains(".")) {
                continue;
            }
                for (int j = 0; j < bord[0].length; j++) {
                    if (copy[i][j].equals("#")) {
                        continue;
                    }
                    if (i != 0 && copy[i - 1][j].equals("#")) {
                        bord[i][j] = "#";
                        flagChange = true;
                    } else if (i != bord.length - 1 && copy[i + 1][j].equals("#")) {
                        bord[i][j] = "#";
                        flagChange = true;
                    } else if (j != 0 && copy[i][j - 1].equals("#")) {
                        bord[i][j] = "#";
                        flagChange = true;
                    } else if (j != bord[0].length - 1 && copy[i][j + 1].equals("#")) {
                        bord[i][j] = "#";
                        flagChange = true;
                    }
                }
        }
        return flagChange;
    }
}