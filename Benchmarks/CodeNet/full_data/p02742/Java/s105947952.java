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
    long H;
    long W;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.H = sc.nextLong();
        this.W = sc.nextLong();
    }
    
    //解答処理
    private long solve() {
        long count = 0;
        
        if (H != 1 && W != 1) {
        	long area = H*W;
        	if (area % 2 == 0) {
        		count = area / 2;
        	} else {
        		count = (area+1) / 2;
        	}
        }
        
        return count;
    }
    
    //出力
    public void show(long answer) {
        System.out.println(answer);
    }

}
