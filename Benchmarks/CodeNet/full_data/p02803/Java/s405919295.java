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
        String[][] copy = new String[h][];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int distance = getMaxDistanceWithBfs( ss , i , j );
                if (maxDistance < distance) {
                    maxDistance = distance;
                }

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

        // 壁なら処理しない
        if ("#".equals(ss[startY][startX])) {
            return 0;
        }

        int distance = 0;

        boolean[][] hasAlreadyPassed = new boolean[ss.length][ss[0].length];

        Queue<Integer> queue = new ArrayDeque<>();

        // スタート位置をキューに追加し探索済みにする
        queue.add( startX );
        queue.add( startY );
        hasAlreadyPassed[startY][startX] = true;

        // キューが空になった時 = 探索できる場所がなくなった時
        // ループ回数 = スタート位置からの距離
        while( !queue.isEmpty()  ) {

            distance++;

            // キューを出し入れするから最初にループ回数を取得しておく
            // キューの値は2つずつ操作するのでループ回数は半分
            int queSize = queue.size();
            for( int i = 0 ; i < queSize / 2 ; i++ ){

                // 取り出した座標 = スタート位置からの同距離の各座標
                int x = queue.remove();
                int y = queue.remove();

                // ↓ 四方を確認して移動できるならキューに追加

                // 上を確認
                if( y != 0 && ".".equals( ss[y-1][x] ) && !hasAlreadyPassed[y-1][x] ){
                    queue.add( x );
                    queue.add( y - 1 );
                    hasAlreadyPassed[y-1][x] = true;
                }
                // 下を確認
                if( y != ss.length - 1 && ".".equals( ss[y+1][x] ) && !hasAlreadyPassed[y+1][x]  ){
                    queue.add( x );
                    queue.add( y + 1 );
                    hasAlreadyPassed[y+1][x] = true;
                }
                // 左を確認
                if( x != 0 && ".".equals( ss[y][x-1] ) && !hasAlreadyPassed[y][x-1] ){
                    queue.add( x - 1 );
                    queue.add( y );
                    hasAlreadyPassed[y][x-1] = true;
                }
                // 右を確認
                if( x != ss[0].length - 1 && ".".equals( ss[y][x+1] ) && !hasAlreadyPassed[y][x+1]  ){
                    queue.add( x + 1 );
                    queue.add( y );
                    hasAlreadyPassed[y][x+1] = true;
                }

            }

        }

        // 処理順の問題で-1
        // 1.終点につく( キューが空でない = while(true) )
        // 2.distance++( 想定の距離より1多い )
        // 3.四方を確認して移動できないことを確認( 終点なのでキューに値が入らない )
        // 4.ループを抜ける
        return distance - 1;

    }

}
