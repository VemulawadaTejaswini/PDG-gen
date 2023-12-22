import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        int H, W;
        char[][] A;

        Queue<CellInfo> blackToBeChecked = new ArrayDeque<>();
        int[] dx = new int[] {-1, 0, 1, 0};
        int[] dy = new int[] {0, -1, 0, 1};

        int ans = 0;
        void solve(InputReader in, PrintWriter out) {
            H = in.nextInt();
            W = in.nextInt();
            A = new char[H][W];
            for (int i = 0; i < H; i++) {
                A[i] = in.next().toCharArray();
            }

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (A[i][j] == '#') {
                        blackToBeChecked.offer(new CellInfo(i, j, 0));
                    }
                }
            }

            while (!blackToBeChecked.isEmpty()) {
                CellInfo info = blackToBeChecked.poll();
                int x = info.x;
                int y = info.y;
                int d = info.d;
                ans = d;
                for (int i = 0; i < 4; i++) {
                    int newX = x + dx[i];
                    int newY = y + dy[i];
                    if (0 <= newX && newX < W && 0 <= newY && newY < H && A[newY][newX] == '.') {
                        A[newY][newX] = '#';
                        blackToBeChecked.offer(new CellInfo(newY, newX, d + 1));
                    }
                }
            }

            out.println(ans);
        }
    }

    static class CellInfo {
        int x, y, d;
        CellInfo(int y, int x, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        int[] nextIntArray(int n) {
        	int[] arr = new int[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextInt();
        	}
        	return arr;
        }
    }
}
