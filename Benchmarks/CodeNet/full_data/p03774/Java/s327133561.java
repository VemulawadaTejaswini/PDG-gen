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
    int M;
    long[] a;
    long[] b;
    long[] c;
    long[] d;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        this.M = sc.nextInt();
        this.a = new long[N];
        this.b = new long[N];
        this.c = new long[M];
        this.d = new long[M];
        for (int i = 0; i < N; i++) {
        	this.a[i] = sc.nextLong();
        	this.b[i] = sc.nextLong();
        }
        for (int i = 0; i < M; i++) {
        	this.c[i] = sc.nextLong();
        	this.d[i] = sc.nextLong();
        }
    }
    
    //解答処理
    private long[] solve() {
        long[] answer = new long[N];
        long distance = 0;
        
        for (int i = 0; i < N; i++) {
        	long min = Long.MAX_VALUE;
        	for (int j = 0; j < M; j++) {
        		long x = Math.abs(a[i] - c[j]);
        		long y = Math.abs(b[i] - d[j]);
        		distance = x + y;
        		if (distance < min) {
        			min = distance;
        			answer[i] = j+1;
        		}
        	}
        }
        
        return answer;
    }
    
    //出力
    public void show(long[] answer) {
    	for (int i = 0; i < answer.length; i++) {
    		System.out.println(answer[i]);   		
    	}
    }

}
