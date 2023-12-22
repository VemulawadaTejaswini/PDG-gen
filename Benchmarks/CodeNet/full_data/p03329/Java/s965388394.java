import java.util.Scanner;

class Main{
	static int N;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int res=N;	//最短記録を記録する

		for(int i=0; i<N; i++) {
			int cc=0;
			int t=i;
			while(t>0) {
				cc+=t%6;
				t/=6;
			}
			t=N-i;

			while(t>0) {
				cc+=t%9;
				t/=9;
			}


			if(res> cc) {
				res=cc;
			}
			//System.out.println(i+" "+res);
		}
		System.out.println(res);
	}
}