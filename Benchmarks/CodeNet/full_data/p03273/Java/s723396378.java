import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(tok.nextToken());
        int w = Integer.parseInt(tok.nextToken());
        char[][] mat = new char[h][w];
        boolean[] rowVisible = new boolean[h];
        boolean[] colVisible = new boolean[w];
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
