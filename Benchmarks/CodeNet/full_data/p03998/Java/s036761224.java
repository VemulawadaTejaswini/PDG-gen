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
    String A;
    String B;
    String C;
    int countA = 0;
    int countB = -1;
    int countC = -1;
    char next = 'a';
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.A = sc.next();
        this.B = sc.next();
        this.C = sc.next();
    }
    
    //解答処理
    private String solve() {
        String answer = null;
        
        while (true) {
        	if (next == 'a') {
        		countA++;
        		if (A.length() == countA) {
            		answer = "A";
            		break;
            	}
        		next = A.charAt(countA);
        	} else if (next == 'b') {
        		countB++;
        		if (B.length() == countB) {
            		answer = "B";
            		break;
            	}
        		next = B.charAt(countB);
        	} else if (next == 'c') {
        		countC++;
        		if (C.length() == countC) {
            		answer = "C";
            		break;
            	}
        		next = C.charAt(countC);
        	}
        }
        
        return answer;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
