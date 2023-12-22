import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
    	new Main().exec(args);
    }

    public Main() {
    }

    public void exec(String args[]) throws Exception {
    	//初期化読み込み
    	Scanner sc = new Scanner(System.in);
    	int N=sc.nextInt();

    	long ansT = 0;
    	long ansA = 0;

    	for(int i=0; i<N; i++) {
    		long T=sc.nextInt();
    		long A=sc.nextInt();
    		if(i==0 || (ansT <= T && ansA <= A)) {
    			ansT = T;
    			ansA = A;
    		}else {
    			double hiT = (double)ansT/T;
    			double hiA = (double)ansA/A;
    			int hi = (int)Math.ceil(Math.max(hiT, hiA));
    			ansT = T*hi;
    			ansA = A*hi;
    		}
    	}
    	System.out.println(ansA+ansT);
	}
}