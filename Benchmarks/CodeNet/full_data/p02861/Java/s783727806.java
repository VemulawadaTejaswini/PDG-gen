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
    int[] x;
    int[] y;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        x = new int[N];
        y = new int[N];
        for (int i=0; i<N; i++) {
        	x[i] = sc.nextInt();
        	y[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private double solve() {
        double answer = 0;
        
        double total = 0;
        double count = 0;
        for (int i=0; i<N-1; i++) {
        	for (int j=i+1; j<N; j++) {
        		double X = Math.pow(x[i]-x[j], 2);
        		double Y = Math.pow(y[i]-y[j], 2);
        		total += Math.sqrt(X+Y);
        		count++;
        	}
        }
        
        answer = total*(N-1) / count;
        return answer;
    }
    
    //出力
    public void show(double answer) {
        System.out.println(answer);
    }

}
