import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    int N;
    ArrayList<Integer> a = new ArrayList<Integer>();
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        for (int i=0; i<N; i++) {
        	a.add(sc.nextInt());
        }
    }
    
    //解答処理
    private int solve() {
        int brick = 0; //砕くレンガの数
        
        int i=0;
        while (true) {
        	if (a.get(i) != i+1) {
        		a.remove(i);
        		brick++;
        		i=0; //参照する要素数のリセット
        	} else {
        		i++;
        	}
        	if (i == a.size()) {
        		break;
        	}
        	
        	
        }
        
        if (brick == N) {
        	brick = -1;
        }
        
        return brick;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
