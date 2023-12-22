//Not complete
package olymp2;


import java.util.Scanner;

/**
 * Created by nickie on 25.02.17 at 14:21
 * <p>
 * yahoo
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char grid[][] = new char[N][N];

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < N; j++) {
                if (line != null && line.length() > j) {
                    grid[i][j] = line.charAt(j);
                } else {
                    System.out.printf("el in grid(%d,%d) was not written - input trouble\n RETRY", i, j);
                    line = null;
                    break;
                }
            }
        }


    }

    private void copyGrid(char src[][], char dest[][]) {
        int N;
        if (src != null && dest != null && (N = src.length) == dest.length && N == src[0].length && N == dest[0].length) {
            for (int i = 0; i < N; i++) {
                System.arraycopy(src[i], 0, dest[i], 0, N);
            }
        } else {
            System.out.println("unmet input parameters, unable to cpy grid");
        }
    }

    private void copyRowToColumn(char src[][]) {
        int N = 0;
        if (src == null ||  (N = src.length) != src[0].length) {
            System.out.println("copyRowToCol err: null pointer");
        }
        char dest[][] = new char[N][N];
        copyGrid(src, dest);
            for (int i = 0; i < N; i++) {
                System.arraycopy(src[i], 0, dest[i], 0, N);
            }
        
    }

    private boolean isPossible(char grid[][]) {
        // it's possible if just one element in the whole grid is black (i.e. '#')
        // that statement has obvious graphical argumentation, thus it's saving our time
        int N;
        boolean hasOneHash = false;
        if (grid != null && (N = grid.length) >= 2 && N <= 500) {
            for (int i = 0; i < N; i++) {
                if (!hasOneHash) {
                    for (int j = 0; j < N; j++) {
                        if (grid[i][j] == '#') {
                            hasOneHash = true;
                            break;
                        }
                    }
                }
            }
        }
        return hasOneHash;
    }

    private boolean hasOneHash(char line[]) {
        // it's possible if just one element in the whole grid is black (i.e. '#')
        // that statement has obvious graphical argumentation, thus it's saving our time
        int N;
        boolean hasOneHash = false;
        if (line != null && (N = line.length) >= 2 && N <= 500) {
            for (int i = 0; i < N; i++) {
                if (line[i] == '#') {
                    hasOneHash = true;
                    break;
                }
            }
        }
        return hasOneHash;
    }

    public int minimum(char grid[][]) {
        //the fastest way to accomplish the task is to find one all black raw line on the grid or to make one
        //e.g. we have {#.#
        //              #..
        //              ... }
        //we get needed line in one step: copy transposed (turned at right angle to the right) 2nd row to 2nd column
        //             {###
        //              #..
        //              ... } then easily 1r -> 1c
        //             {###
        //              #..
        //              #.. } 1r -> 2c
        //             {###
        //              ##.
        //              ##. } finally 1r -> 3c
        //             {###
        //              ###
        //              ### } finally 1r -> 3c
        //now we have empirical formula of getting the fastest solution: n = bR + N - bC
        //which means n (minimum number of steps needed) equals to bR (steps needed to make one all-black row)
        //              plus N (length of square matrix) minus bC (already black columns)
        if (isPossible(grid)) {
            int minimum = 0;
            int N = grid.length;
            for (int i = 0; i < N; i++) {
                char gridCopy[][] = new char[N][N];
                copyGrid(grid, gridCopy);
                minimum = 0;
                for (int j = 0; j < N; j++) {
                    if (hasOneHash(gridCopy[j])) {
                        minimum++;
                        for (int k = j + 1; k < N; k++) {
                            if (hasOneHash(gridCopy[k])) {

                            }
                        }
                    }
                }
            }
            return minimum;
        } else {
            return -1;
        }
    }
}


