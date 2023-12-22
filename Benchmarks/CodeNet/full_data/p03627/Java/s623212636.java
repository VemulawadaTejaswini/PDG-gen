import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
	 	Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long[] A=new long[N];
		for(int i=0;i<N;++i){
			A[i]=sc.nextLong();
		}
		Arrays.sort(A);
		long ans=0;
		int p0=N-1;
		while(p0>0&&A[p0]!=A[p0-1])--p0; //A[p0]==A[p0-1]
		int p1=p0-2;
		while(p1>0&&A[p1]!=A[p1-1])--p1;
		if(p0>0&&p1>0&&A[p0]==A[p0-1]&&A[p1]==A[p1-1])ans=A[p0]*A[p1];
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
