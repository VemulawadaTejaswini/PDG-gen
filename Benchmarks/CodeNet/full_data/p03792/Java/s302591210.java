import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        new Main().solve();
    }

    private int N;
    private char[][] board;

    private void solve() {
        try (Scanner in = new Scanner(System.in)) {
            this.N = Integer.parseInt(in.nextLine());
            this.board = new char[N][N];
            for (int i = 0; i < N; i++) {
                board[i] = in.nextLine().toCharArray();
            }

            if (isAllWhite()) {
                System.out.println(-1);
                return;
            }

            System.out.println(bfs(board));
        }
    }

    private boolean isAllWhite() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] != '.') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isAllBlack(char[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }

    private int bfs(char[][] board) {
        HashSet<Long> used = new HashSet<>();
        LinkedList<State> queue = new LinkedList<>();
        {
            State e = new State();
            e.numMoves = 0;
            e.board = new char[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    e.board[i][j] = board[i][j];
                }
            }

            long hash = calculateHash(e);

            used.add(hash);
            queue.add(e);
        }
        for (; !queue.isEmpty();) {
            State poll = queue.poll();

            if (isAllBlack(poll.board)) {
                return poll.numMoves;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    State e = new State();
                    e.numMoves = poll.numMoves + 1;
                    e.board = copy(poll.board);
                    char[] copyi = new char[N];
                    for (int k = 0; k < N; k++) {
                        copyi[k] = e.board[i][k];
                    }
                    for (int k = 0; k < N; k++) {
                        e.board[k][j] = copyi[k];
                    }

                    long hash = calculateHash(e);

                    if (used.add(hash)) {
                        queue.add(e);
                    }
                }
            }
        }
        return -1;

    }

    private long calculateHash(State e) {
        long hash = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                hash <<= 1;
                hash += e.board[i][j] == '.' ? 0 : 1;
            }
        }
        return hash;
    }

    private char[][] copy(char[][] board) {
        char[][] copy = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                copy[i][j] = board[i][j];
            }
        }
        return copy;
    }

}

class State {

    public char[][] board;
    public int numMoves;

}