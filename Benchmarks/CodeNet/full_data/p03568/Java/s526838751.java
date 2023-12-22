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
    int[] A;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.A = new int[N];
        for (int i=0; i<N; i++) {
        	A[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private int solve() {
    	//全ての項の積が偶数 = 最低1つの項は偶数　→　全体の組み合わせから全ての項が奇数の場合を除く
        int countTotal = (int)Math.pow(3, N);
        int countOdd = 1;
        
        for (int i=0; i<N; i++) {
        	if (A[i] % 2 == 0) {
        		countOdd *= 2;
        	}
        }
        
        return countTotal - countOdd;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
