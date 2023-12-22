import java.util.Scanner;

public class Main {

    public static class Player {

        public int[] enemies;
        public int current;
        public boolean isMatched;

        public Player( int n ){
            enemies = new int[ n - 1 ];
            current = 0;
            isMatched = false;
        }

    }

    public static boolean check( Player[] players , int n ){
        for( int i = 0 ; i < n ; i++ ){
            if( players[i].current !=  n - 2 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt( in.nextLine() );
        Player[] players  = new Player[n];
        for( int i = 0 ; i < n ; i++ ){
            String[] params = in.nextLine().split(" ");
            players[i] = new Player(n);
            int[] as = new int[n-1];
            for( int j = 0 ; j < n - 1 ; j++ ){
                as[j] = Integer.parseInt(params[j]) - 1;
            }
            players[i].enemies = as;
        }

        int count = 0;
        // 日単位のループ
        while (true ){

            for( int i = 0 ; i < n ; i++ ){

                // 既に対戦が終了していた場合はcontinue
                if( players[i].current == n - 1 ){
                    continue;
                }

                // 対戦相手配列index
                int enemyIndex = players[i].enemies[players[i].current];

                // 既にどちらかが対戦済みなら次の対戦相手のチェックへ
                if( players[i].isMatched || players[enemyIndex].isMatched ){
                    continue;
                }

                // 対戦相手とマッチングしたらマッチしたこと、次の対戦相手の情報へ
                if( i == players[enemyIndex].enemies[players[enemyIndex].current] ){
                    players[i].isMatched = true;
                    players[enemyIndex].isMatched = true;
                    players[i].current++;
                    players[enemyIndex].current++;
                }
            }

            count++;

            // 全てのメンバーが最後まで試合できていれば終了
            boolean isEnd = true;
            // 当日全てのメンバーがマッチできなければ-1
            boolean isMatched = false;
            for( int i = 0 ; i < n ; i++ ){
                if( players[i].current != n - 1 ){
                    isEnd = false;
                }
                if( !isMatched && players[i].isMatched ) {
                    isMatched = true;
                }
                players[i].isMatched = false;
            }

            if( isEnd ){
                System.out.println( count );
                return;
            }
            if( !isMatched ){
                System.out.println( -1 );
                return;
            }

        }


    }

}

/*










 */