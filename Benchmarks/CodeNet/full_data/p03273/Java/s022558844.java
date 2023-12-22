import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static BufferedReader br;
    static StringTokenizer tok;
    static int h, w;
    static char[][] mat = new char[100][100];
    static boolean[] rowVisible = new boolean[100];
    static boolean[] colVisible = new boolean[100];
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        tok = new StringTokenizer(br.readLine());
        h = Integer.parseInt(tok.nextToken());
        w = Integer.parseInt(tok.nextToken());
        // 読み込み
        for (int i = 0; i < h; i++) {
            String row = br.readLine();
            for (int j = 0; j < w; j++) {
                char c = row.charAt(j);
                mat[i][j] = c;
                if (c == '#') {
                    rowVisible[i] = true;
                    colVisible[j] = true;
                }
            }
        }
        // 表示
        for (int i = 0; i < h; i++) {
            if (!rowVisible[i]) continue;
            for (int j = 0; j < w; j++) {
                if (!colVisible[j]) continue;
                System.out.print(mat[i][j]);
            }
            System.out.print("\n");
        }
    }
}
