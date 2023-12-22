import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        char cs[][] = new char[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            cs[i] = s.toCharArray();
        }

        int spaceRow[] = new int[h];
        for (int i = 0; i < h; i++) {
            boolean space = true;
            for (int j = 0; j < w; j++) {
                if (cs[i][j] == '#') {
                    space = false;
                    break;
                }
            }

            if (space) {
                spaceRow[i] = 1;
            }
        }

        int spaceCol[] = new int[w];
        for (int i = 0; i < w; i++) {
            boolean space = true;
            for (int j = 0; j < h; j++) {
                if (cs[j][i] == '#') {
                    space = false;
                    break;
                }
            }

            if (space) {
                spaceCol[i] = 1;
            }
        }

        for (int i = 0; i < h; i++) {
            if (spaceRow[i] == 1) continue;
            for (int j = 0; j < w; j++) {
                if (spaceCol[j] == 1) continue;
                System.out.print(cs[i][j]);
            }
            System.out.println();
        }
    }
}
