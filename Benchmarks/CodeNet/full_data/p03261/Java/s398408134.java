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
    String[] W;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
        W = new String[N];
        for (int i=0; i<N; i++) {
        	W[i] = sc.next();
        }
    }
    
    //解答処理
    private boolean solve() {
        boolean answer = true;
        
        for (int i=1; i<N; i++) {
        	if (!(W[i-1].charAt(W[i-1].length()-1) == W[i].charAt(0))) {
        		answer = false;
        		break;
        	}
        	for (int j=0; j<i; j++) {
        		if (W[i].equals(W[j])) {
        			answer = false;
            		break;
        		}
        	}
        }
        
        return answer;
    }
    
    //出力
    public void show(boolean answer) {
        if (answer) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }

}
