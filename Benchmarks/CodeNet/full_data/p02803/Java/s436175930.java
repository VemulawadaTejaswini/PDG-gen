import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int h = Integer.parseInt(params[0]);
        int w = Integer.parseInt(params[1]);
        String[][] ss = new String[h][w];
        for (int i = 0; i < h; i++) {
            params = in.nextLine().split("");
            for (int j = 0; j < w; j++) {
                ss[i][j] = params[j];
            }
        }

        // 全ての場所をスタート地点として最長距離を回答とする
        int maxDistance = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                maxDistance = Math.max( maxDistance , getMaxDistanceWithBfs( ss , i , j ) );
            }
        }

        System.out.println(maxDistance);

    }

    /**
     * 幅優先探索で最長距離を返す
     * @param ss 迷路の配列
     * @param startY スタート地点のY座標
     * @param startX スタート地点のX座標
     * @return 最長距離
     */
    private static int getMaxDistanceWithBfs( String[][] ss , int startY , int startX ) {

        int[][] distances = new int[ss.length][ss[0].length];
        Queue<Integer> queue = new ArrayDeque<>();

        // 四方の距離の定義 順に左上右下
        int[] dx = { -1 , 0 , 1 , 0 };
        int[] dy = { 0 , 1 , 0 , -1 };

        int maxDistance = 0;

        // スタート位置をキューに追加しておく
        queue.add( startX );
        queue.add( startY );

        // キューが空になった時 = 探索できる場所がなくなった時
        // ループ回数 = スタート位置からの距離
        while( !queue.isEmpty()  ) {

            int x = queue.remove();
            int y = queue.remove();

            // 今いる場所が壁の場合処理しない
            if( "#".equals( ss[y][x] ) ){
                continue;
            }

            maxDistance = Math.max( maxDistance , distances[y][x] );

            // 四方を確認
            for( int i = 0 ; i < 4 ; i++ ){

                // 確認先の座標
                int xx = x + dx[i];
                int yy = y + dy[i];

                // 確認先の座標が配列外にいないこと
                if( !( 0 <= yy && yy < ss.length && 0 <= xx && xx < ss[0].length ) ) {
                    continue;
                }

                // 確認先の座標が壁でないこと
                if( !".".equals( ss[yy][xx] ) ) {
                    continue;
                }

                // 既に通った道でないこと
                if( distances[yy][xx] != 0 ){
                    continue;
                }

                // スタート地点でないこと
                if( xx == startX && yy == startY ){
                    continue;
                }

                queue.add( xx );
                queue.add( yy );
                distances[yy][xx] = distances[y][x] + 1;

            }

        }

        return maxDistance;

    }

}
