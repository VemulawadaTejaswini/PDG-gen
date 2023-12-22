import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] X=new int[N];
		for(int i=0;i<N;++i) {
			X[i]=sc.nextInt();
		}
		long ans=Long.MAX_VALUE/3;
		for(int p=0;p<=200;++p) {
			long cur=0;
			for(int x:X) {
				cur+=(x-p)*(x-p);
			}
			ans=Math.min(ans, cur);
		}
		System.out.println(ans);
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
