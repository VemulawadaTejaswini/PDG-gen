import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	//[l,r)
	long sum1(int l,int r) {
		return (long)(r-l)*(r+l-1)/2;
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		double max=0,cur=0;
		int N=sc.nextInt();//1+2+...+p=p*(p+1)/2
		int K=sc.nextInt();
		int[] p=new int[N];
		for(int i=0;i<N;++i)p[i]=sc.nextInt();
		for(int t=0;t<N;++t) {
			cur+=(p[t]+1)*0.5-(t-K>=0?(p[t-K]+1)*0.5:0);
			max=Math.max(max, cur);
		}
		System.out.println(max);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
