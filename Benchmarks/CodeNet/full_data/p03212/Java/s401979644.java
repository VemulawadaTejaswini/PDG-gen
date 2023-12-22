import java.util.Scanner;
class Main{
	static int keta=0;
	static int kotae=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int N=Integer.parseInt(a);
		keta=a.length();
		tansaku(keta,1,3L,N);
		tansaku(keta,1,5L,N);
		tansaku(keta,1,7L,N);
		System.out.println(kotae);
	}
	static void tansaku(int depth,int now_depth,long atai,int N) {
		long tmp=atai;
		boolean[] sgs=new boolean[3];
		for(int i=0; i<now_depth; i++) {
			int a=(int)(tmp%10);
			sgs[(a-3)/2]=true;
			tmp/=10;
		}
		if(sgs[0]&&sgs[1]&&sgs[2]&& atai<=N) {
			kotae++;
		}
		if(now_depth+1<=depth) {
			tansaku(keta,now_depth+1,atai*10+3,N);
			tansaku(keta,now_depth+1,atai*10+5,N);
			tansaku(keta,now_depth+1,atai*10+7,N);
		}
	}
}