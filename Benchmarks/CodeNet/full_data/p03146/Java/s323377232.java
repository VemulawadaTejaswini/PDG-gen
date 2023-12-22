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
    int s;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        s = sc.nextInt();
    }
    
    //解答処理
    private int solve() {
    	ArrayList<Integer> a = new ArrayList<Integer>();
    	a.add(s);	//初項
    	
    	int m = 0;
        for (int i=1; i<100000; i++) {
        	if (a.get(i-1) % 2 == 0) {
        		s =  s /2;
        	} else {
        		s = 3 * s + 1;
        	}
        	if (a.contains(s)) {
        		m = i + 1;
        		break;
        	} else {
        		a.add(s);
        	}
        }
        
        return m;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
