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
    String S;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
        S = sc.next();
    }
    
    //解答処理
    private int solve() {
    	int max = 0;
        
    	for (int i=1; i<N; i++) {
    		int count = 0;
    		boolean[] a1 = new boolean[26];	//左用
        	boolean[] a2 = new boolean[26];	//右用
        	String leftS = S.substring(0,i);
        	String rigthS = S.substring(i,N);
        	
        	//対応する要素番号の要素をtrueにする
        	for (int j=0; j<leftS.length(); j++) {
        		a1[leftS.charAt(j)-'a'] = true;
        	}
        	for (int j=0; j<rigthS.length(); j++) {
        		a2[rigthS.charAt(j)-'a'] = true;
        	}
        	
        	for (int j=0;j<26;j++){
                if (a1[j] && a2[j]){
                  count++;	//両方に存在していればカウント
                }
            }
        	max = Math.max(max,count);
    	}
        return max;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
