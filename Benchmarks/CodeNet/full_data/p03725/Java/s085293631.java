import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String[] split = in.nextLine().split(" ");
            int H = Integer.parseInt(split[0]);
            int W = Integer.parseInt(split[1]);
            int K = Integer.parseInt(split[2]);

            int startH = -1;
            int startW = -1;

            int[][] board = new int[H][W];
            for (int h = 0; h < H; h++) {
                String line = in.nextLine();
                Utils.debug(h, line);
                for (int w = 0; w < W; w++) {
                    char charAt = line.charAt(w);
                    board[h][w] = charAt == '#' ? 1 : 0;
                    if (charAt == 'S') {
                        startH = h;
                        startW = w;
                    }
                }
            }

            int min = (int) 1e9;

            int[] dr = new int[] { -1, 0, 0, 1, };
            int[] dc = new int[] { 0, -1, 1, 0, };

            int[][] used = new int[H][W];
            for (int i = 0; i < used.length; i++) {
                for (int j = 0; j < used[i].length; j++) {
                    used[i][j] = (int) 1e9;
                }
            }
            int[][] usedK = new int[H][W];
            int[][] usedMoveK = new int[H][W];
            LinkedList<State> queue = new LinkedList<>();
            {
                State e = new State(startH, startW, 0, 0, 0);
                queue.addLast(e);
                used[e.h][e.w] = e.numMagics;
                usedK[e.h][e.w] = e.k;
                usedMoveK[e.h][e.w] = e.moveK;
            }
            for (; !queue.isEmpty();) {
                State current = queue.pollFirst();

                // Utils.debug(current.h, current.w, current.numMagics, current.moveK, current.k);

                if (current.h == 0 || current.h == H - 1 || current.w == 0 || current.w == W - 1) {
                    min = Math.min(min, current.numMagics);
                }

                for (int d = 0; d < dr.length; d++) {
                    int nextH = current.h + dr[d];
                    int nextW = current.w + dc[d];
                    if (nextH < 0 || nextH >= H || nextW < 0 || nextW >= W) {
                        continue;
                    }

                    int nextNumMagics = current.numMagics;
                    int nextMoveK = current.moveK;
                    int nextK = current.k;

                    // if (nextMoveK < 0) {
                    // nextNumMagics++;
                    // nextMoveK += K;
                    // // continue;
                    // }

                    if (board[current.h][current.w] == 1) {
                        if (board[nextH][nextW] == 1) {
                            nextMoveK--;
                            nextK--;
                            if (nextK < 0) {
                                nextNumMagics++;
                                nextK += K;
                                nextMoveK = K - 1;
                            } else if (nextMoveK < 0) {
                                nextNumMagics++;
                                nextK = K - 1;
                                nextMoveK += K;
                            }
                            // continue;
                        } else {
                            nextNumMagics++;
                            nextMoveK = K - 1;
                            nextK = K;
                            // continue;
                        }
                    } else {
                        if (board[nextH][nextW] == 1) {
                            // nextNumMagics++;
                            // nextMoveK = K - 1;
                            // nextK = K;

                            if (current.numMagics == 0) {
                                nextNumMagics++;
                            }
                            nextNumMagics++;
                            nextMoveK = K - 1;
                            nextK = K - 1;

                            // if (nextK < 0) {
                            // nextNumMagics++;
                            // nextK += K;
                            // nextMoveK = K - 1;
                            // } else if (nextMoveK < 0) {
                            // nextNumMagics++;
                            // nextK = K - 1;
                            // nextMoveK += K;
                            // }
                            // continue;
                        } else {
                            nextMoveK--;
                            if (nextMoveK < 0) {
                                nextNumMagics++;
                                nextMoveK = K - 1;
                                nextK = K;
                            }
                            // nextK--;
                            // continue;
                        }
                    }

                    if (nextNumMagics > used[nextH][nextW]) {
                        continue;
                    }
                    if (nextNumMagics == used[nextH][nextW]) {
                        if (nextMoveK < usedMoveK[nextH][nextW]) {
                            continue;
                        }
                        if (nextMoveK == usedMoveK[nextH][nextW]) {
                            if (nextK < usedK[nextH][nextW]) {
                                continue;
                            }
                        }
                    }

                    queue.addLast(new State(nextH, nextW, nextNumMagics, nextK, nextMoveK));
                    used[nextH][nextW] = nextNumMagics;
                    usedK[nextH][nextW] = nextK;
                    usedMoveK[nextH][nextW] = nextMoveK;
                }

            }

            for (int i = 0; i < used.length; i++) {
                Utils.debug(i, used[i]);
            }

            System.out.println(min);

        }
    }
}

class State {
    int h;
    int w;
    int numMagics;
    int k;
    int moveK;

    public State(int h, int w, int numMagics, int k, int moveK) {
        super();
        this.h = h;
        this.w = w;
        this.numMagics = numMagics;
        this.k = k;
        this.moveK = moveK;
    }
}

final class Utils {
    private Utils() {
    }

    public static final void debug(Object... o) {
        System.err.println(toString(o));
    }

    public static final void debug2(Object... o) {
        System.err.println(toString(o));
    }

    public static final String toString(Object... o) {
        return Arrays.deepToString(o);
    }

}
