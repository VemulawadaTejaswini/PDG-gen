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
    String S;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.S = sc.next();
    }
    
    //解答処理
    private int solve() {
        int count = 0;
        if (!Palindrome(S)) {
        	for (int i=0; i<S.length()/2; i++) {
        		if (S.charAt(i) != S.charAt(S.length()-i-1)) {
        			count++;
        		}
        	}
        }
        
        return count;
    }
    
    private boolean Palindrome(String str) {	//回文か判定するメソッド
    	boolean kaibun = false;
    	StringBuilder reverses = new StringBuilder(str).reverse();
    	String reverseS = reverses.toString();
    	
    	if (str.equals(reverseS)) {
    		kaibun = true;
    	}
    	
    	return kaibun;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
