import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[][] A = new String[H][W];
        String[][] R = new String[H][W];
        for (int i=0; i<H; i++) {
            String row = sc.next();
            for (int k=0; k<row.length(); k++) {
                A[i][k] = String.valueOf(row.charAt(k));
                R[i][k] = String.valueOf(row.charAt(k));
            }
        }
        int loop = 0;
        while (true) {
            loop++;
            int fill = 0;
            for (int i=0; i<H; i++) {
                for (int j = 0; j < W; j++) {
                    A[i][j] = R[i][j];
                }
            }
            for (int i=0; i<H; i++) {
                for (int j=0; j<W; j++) {
                    if (A[i][j].equals(".")) {
                        if (i > 0 && A[i-1][j].equals("#")) {
                            R[i][j] = "#";
                        }
                        if (i+1 < H && A[i+1][j].equals("#")) {
                            R[i][j] = "#";
                        }
                        if (j > 0 && A[i][j-1].equals("#")) {
                            R[i][j] = "#";
                        }
                        if (j+1 < W && A[i][j+1].equals("#")) {
                            R[i][j] = "#";
                        }
                        if (R[i][j].equals(".")) {
                            fill++;
                        }
                    }
                }
            }
            if (fill == 0) {
                break;
            }
        }

        System.out.println(loop);
    }

}