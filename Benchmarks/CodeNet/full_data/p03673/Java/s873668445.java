import java.util.ArrayDeque;
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
    int n;
    int[] a;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.n = sc.nextInt();
        this.a = new int[n];
        for (int i=0; i<n; i++) {
        	a[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private ArrayDeque<Integer> solve() {
    	ArrayDeque<Integer> b = new ArrayDeque<Integer>();
        
    	for (int i=0; i<n; i++) {
    		if ((i+1)%2!=0 && n%2!=0 || (i+1)%2==0 && n%2==0) {
    			b.addFirst(a[i]);
    		} else {
    			b.addLast(a[i]);
    		}
    	}
    	
        return b;
    }
    
    //出力
    public void show(ArrayDeque<Integer> answer) {
        for (int i=0; i<a.length; i++) {
        	System.out.print(answer.removeFirst());
        	System.out.print(" ");
        }
    }

}
