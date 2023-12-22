import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    char[][] board = new char[1000][];
    int H,W;
    List<Integer> sharpx = new LinkedList<>();
    List<Integer> sharpy = new LinkedList<>();
    List<Integer> tmpSharpx = new LinkedList<>();
    List<Integer> tmpSharpy = new LinkedList<>();
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            H = sc.nextInt();
            W = sc.nextInt();

            for (int i = 0; i < H; i++) {
                board[i] = new char[1001];
                String input = sc.next();
                for (int j = 0; j < W; j++) {
                    board[i][j] = input.charAt(j);
                    if (board[i][j] == '#') {
                        sharpx.add(j);
                        sharpy.add(i);
                    }
                }
            }

            int count = 0;

            while (sharpx.size() < H * W) {
                tmpSharpx.clear();
                tmpSharpy.clear();
                /*
                for (int i = 0; i < sharpx.size(); i++) {
                    int sx = sharpx.get(i);
                    int sy = sharpy.get(i);
                    color(sx, sy);
                }
                */
                Iterator itrx = sharpx.iterator();
                Iterator itry = sharpy.iterator();

                while(itrx.hasNext()) {
                    color((int) itrx.next(), (int) itry.next());
                }

                sharpx.addAll(tmpSharpx);
                sharpy.addAll(tmpSharpy);
                count ++;
            }

            System.out.println(count);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void color (int x, int y) {
        if (x == 0) {
            if (board[y][x+1] == '.') {
                board[y][x + 1] = '#';
                tmpSharpx.add(x + 1);
                tmpSharpy.add(y);
            }
        } else if (x == W - 1) {
            if (board[y][x-1] == '.') {
                board[y][x - 1] = '#';
                tmpSharpx.add(x - 1);
                tmpSharpy.add(y);
            }
        } else {
            if (board[y][x+1] == '.') {
                board[y][x + 1] = '#';
                tmpSharpx.add(x + 1);
                tmpSharpy.add(y);
            }
            if (board[y][x-1] == '.') {
                board[y][x - 1] = '#';
                tmpSharpx.add(x - 1);
                tmpSharpy.add(y);
            }
        }

        if (y == 0) {
            if (board[y+1][x] == '.') {
                board[y + 1][x] = '#';
                tmpSharpx.add(x);
                tmpSharpy.add(y + 1);
            }
        } else if (y == H - 1) {
            if (board[y-1][x] == '.') {
                board[y-1][x] = '#';
                tmpSharpx.add(x);
                tmpSharpy.add(y-1);
            }
        } else {
            if (board[y+1][x] == '.') {
                board[y + 1][x] = '#';
                tmpSharpx.add(x);
                tmpSharpy.add(y + 1);
            }
            if (board[y-1][x] == '.') {
                board[y-1][x] = '#';
                tmpSharpx.add(x);
                tmpSharpy.add(y-1);
            }
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }
}