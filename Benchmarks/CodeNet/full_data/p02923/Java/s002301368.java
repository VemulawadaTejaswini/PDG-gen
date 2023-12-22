import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    int N;
    int[] H;
    int max = 0;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
        H = new int[N];
        for (int i=0; i<N; ++i){
            H[i] = sc.nextInt();
        }
    }
    
    //解答処理
    int solve() {
        int count = 0;
        for (int i=0; i<N-1; i++){
            if (H[i] >= H[i+1]){    //右隣のマスが今のマスの高さ以下であれば回数をカウント
                ++count;
            } else {
                count = 0;
            }
            max = Math.max(count,max);  //大きい方をmaxに代入
        }

        return max;
    }
    
    //出力
    void show(int answer) {
        System.out.println(answer);
    }
}