import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    int N;
    int X;
    int[] m;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
        X = sc.nextInt();
        m = new int[N];
        for (int i=0; i<N; ++i){
            m[i] = sc.nextInt();
        }
    }
    
    //解答処理
    int solve() {
        int count =0;
        Arrays.sort(m); //昇順にソート
        
        int i=0;
        while (true){
            X -= m[i];
            ++count;
            if (m[0] >= X){
                break;
            }
        }
        
        return count;
    }
    
    //出力
    void show(int answer) {
        System.out.println(answer);
    }
}
