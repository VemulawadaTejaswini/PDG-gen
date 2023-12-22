import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long K=sc.nextLong();
		long X=sc.nextLong();
		long Y=sc.nextLong();
		long ans=0;
		for(int i=1;i<=N;++i) {
			if(i<=K) {
				ans+=X;
			}else {
				ans+=Y;
			}
		}
		System.out.println(ans);
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
