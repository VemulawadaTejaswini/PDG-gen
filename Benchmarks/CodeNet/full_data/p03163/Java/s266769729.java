import java.util.Scanner;;

public class Main {
static int []iw;
static int[]iv;
static int n;
static int w;
static long[][]memo;

public static long val(int in,int rw) {
	if(in==n||rw<=0)
		return 0;
	if(iw[in]>rw)
		return memo[in][rw]=val(in+1,rw);
	if(memo[in][rw]!=-1)
		return memo[in][rw];
	return memo[in][rw]=Math.max(val(in+1,rw),iv[in]+val(in+1,rw-iw[in]));
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		w=sc.nextInt();
		iw=new int[n];
		iv=new int[n];
		for(int i=0;i<n;i++) {
			iw[i]=sc.nextInt();
			iv[i]=sc.nextInt();
		}
		memo=new long[n][w+1];
		for(int i=0;i<n;i++)
			for(int j=0;j<w+1;j++)
				memo[i][j]=-1;
		System.out.println(val(0,w));
		
		
		sc.close();
	}

}
