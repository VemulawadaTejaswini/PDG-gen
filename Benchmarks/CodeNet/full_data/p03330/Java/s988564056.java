import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = sc.nextInt();

        int[][] D = new int[c][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                D[i][j] = sc.nextInt();
            }
        }

        int[] firstGrid = new int[(int)Math.ceil(N*N / 3.0)];
        int[] secondGrid = new int[(int)Math.ceil(N*N / 3.0)];
        int[] thirdGrid = new int[(int)Math.ceil(N*N / 3.0)];

        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c; j++) {
                if ((i + j) % 3 == 0) {
                    firstGrid[(i + j) / 3] = sc.nextInt();
                } else if ((i + j) % 3 == 1) {
                    secondGrid[(i + j) / 3] = sc.nextInt();
                } else {
                    thirdGrid[(i + j) / 3] = sc.nextInt();
                }
            }
        }

        // 以下回答
        int min = Integer.MAX_VALUE;

        for (int fic = 1; fic <= c; fic++) {
            for (int sec = 1; sec <= c; sec++) {
                if (sec == fic) {
                    continue;
                }

                for (int thc = 1; thc <= c; thc++) {
                    if (thc == fic || thc == sec) {
                        continue;
                    }

                    int firstScore = 0;
                    int secondScore = 0;
                    int thirdScore = 0;

                    for (int i = 0; i < firstGrid.length; i++) {
                        firstScore += D[firstGrid[i]][fic];
                    }

                    for (int i = 0; i < secondGrid.length; i++) {
                        secondScore += D[secondGrid[i]][sec];
                    }

                    for (int i = 0; i < thirdGrid.length; i++) {
                        thirdScore += D[thirdGrid[i]][thc];
                    }

                    if (min < firstScore + secondScore + thirdScore) {
                        min = firstScore + secondScore + thirdScore;
                    }

                }
            }
        }

        System.out.println(min);
    }


}