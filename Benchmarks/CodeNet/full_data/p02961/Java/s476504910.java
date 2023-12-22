import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int K = Integer.parseInt(reader.readLine());
            String[] array = reader.readLine().split(" ");
            int X = Integer.parseInt(array[0]);
            int Y = Integer.parseInt(array[1]);

            if (K % 2 == 0 && Math.abs(X + Y) % 2 == 1) {
                System.out.println(-1);
                System.exit(0);
            }

            int x = 0, y = 0;

            int s = 0;
            StringBuilder pos = new StringBuilder();

            while (true) {
                s++;

                int d = Math.abs(X - x) + Math.abs(Y - y);

                // 2K以上離れていれば単に近づける
                if (d >= 2 * K) {
                    int dx = Math.min(K, Math.abs(X - x));
                    x += (X - x >= 0 ? 1 : -1) * dx;
                    y += (Y - y >= 0 ? 1 : -1) * (K - dx);
                }
                // 距離がKならそのままゴールイン
                else if (d == K) {
                    x = X;
                    y = Y;
                }
                // 2K未満の距離で、残り距離が偶数なら、距離Kの位置に移動
                else if (d % 2 == 0) {
                    if (Math.abs(X - x) >= K) {
                        int dx = d / 2;
                        x += (X - x >= 0 ? 1 : -1) * dx;
                        y -= (Y - y >= 0 ? 1 : -1) * (K - dx);
                    } else {
                        int dx = (K * 2 - d) / 2;
                        x += (X - x >= 0 ? 1 : -1) * dx;
                        y += (Y - y >= 0 ? 1 : -1) * (K - dx);
                    }
                }
                // 2K未満の距離で、残り距離が奇数なら、ゴールの近くに移動
                else {
                    int dx = Math.min(K, Math.abs(X - x));
                    x += (X - x >= 0 ? 1 : -1) * dx;
                    y += (Y - y >= 0 ? 1 : -1) * (K - dx);
                }

                pos.append(x).append(" ").append(y).append("\n");

                if (x == X && y == Y) {
                    break;
                }
            }

            System.out.println(s);
            System.out.print(pos.toString());
        }
    }

}
