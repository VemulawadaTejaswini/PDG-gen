import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //g[i][j]:i番目の人がj番目の人の事を何と言っているのか(正直者=1,不親切=0,情報なし=-1)
        int[][] g = new int[N][N];
        int ans = 0;

        //全て情報なしに初期化
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                g[i][j] = -1; 
            }
        }
        //入力
        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            for(int j = 0; j < A; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                g[i][x-1] = y; //0番目から14番目と番号を振る
            }
        }

        //2^N通りをbit全探索, iのbit列で正直者と不親切な人を決定する
        //例：0010:4人中2番目の人だけが正直者
        for(int i = 0; i < (1<<N); i++){
            int[] d = new int[N];
            for(int j = 0; j < N; j++){
                if((1 & i>>j) == 1){ //iのjbit目は1か?(右から0bit目,1bit目, ...)
                    d[j] = 1; //個々のiの場合において,j番目の人が正直者:d[j] = 1
                }
            }

            //証言が矛盾していないかをO(N^2)で調べる
            boolean ok = true;
            for(int j = 0; j < N; j++){
                if(d[j] == 1){ //正直者の言うことだけ調べる
                    for(int k = 0; k < N; k++){
                        if(g[j][k] == -1) continue; //情報なしはスキップ
                        if(g[j][k] != d[k]) ok = false;
                        //正直者のk番目の人についての証言とその真偽が一致しなかったのでこのiは矛盾
                    }
                }
            }

            //bit列iに1がいくつあるか数える(正直者の人数)
            int popcount = 0;
            for(int l = 0; l < N; l++){
                if((1 & i>>l) == 1) popcount++;
            }
            if(ok) ans = Math.max(ans, popcount);
        }

        System.out.println(ans);
    }
}