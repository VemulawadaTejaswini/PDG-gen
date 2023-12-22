import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        int[][] grid = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        ArrayList<Integer> xOperationBefore = new ArrayList<>();
        ArrayList<Integer> xOperationAfter = new ArrayList<>();
        ArrayList<Integer> yOperationBefore = new ArrayList<>();
        ArrayList<Integer> yOperationAfter = new ArrayList<>();

        int rowPointer = 0;
        int colPointer = 0;

        Integer xStock = null;
        Integer yStock = null;

        while (rowPointer <= H - 1) {
            if (grid[rowPointer][colPointer] % 2 != 0) {
                if (xStock == null && yStock == null) {
                    xStock = colPointer;
                    yStock = rowPointer;
                } else {
                    int xp = xStock;
                    int yp = yStock;

                    do {
                        if (yp % 2 == 0 && xp < W - 1) {
                           xOperationBefore.add(xp);
                           xOperationAfter.add(xp + 1);
                           yOperationBefore.add(yp);
                           yOperationAfter.add(yp);
                           xp++;
                           continue;
                        }

                        if (yp % 2 == 0 && xp == W - 1) {
                            xOperationBefore.add(xp);
                            xOperationAfter.add(xp);
                            yOperationBefore.add(yp);
                            yOperationAfter.add(yp + 1);
                            yp++;
                            continue;
                        }

                        if (yp % 2 != 0 && xp > 0) {
                            xOperationBefore.add(xp);
                            xOperationAfter.add(xp - 1);
                            yOperationBefore.add(yp);
                            yOperationAfter.add(yp);
                            xp--;
                            continue;
                        }

                        if (yp % 2 != 0 && xp == 0) {
                            xOperationBefore.add(xp);
                            xOperationAfter.add(xp);
                            yOperationBefore.add(yp);
                            yOperationAfter.add(yp + 1);
                            yp++;
                            continue;
                        }
                    } while (grid[yp][xp] % 2 == 0);

                    xStock = null;
                    yStock = null;
                }
            }

            if (rowPointer % 2 == 0 && colPointer == W - 1) {
                rowPointer++;
                colPointer = W - 1;
                continue;
            }

            if (rowPointer % 2 == 0 && colPointer != W - 1) {
                colPointer++;
                continue;
            }

            if (rowPointer % 2 == 1 && colPointer == 0) {
                rowPointer++;
                colPointer = 0;
                continue;
            }

            if (rowPointer % 2 == 1 && colPointer != 0) {
                colPointer--;
                continue;
            }
        }

        int ansN = xOperationAfter.size();
        System.out.println(ansN);
        for (int i = 0; i < ansN; i++) {
            System.out.print(yOperationBefore.get(i) + 1);
            System.out.print(' ');
            System.out.print(xOperationBefore.get(i) + 1);
            System.out.print(' ');
            System.out.print(yOperationAfter.get(i) + 1);
            System.out.print(' ');
            System.out.println(xOperationAfter.get(i) + 1);
        }
    }
}