import java.util.Scanner;;

public class Main {
static int []iw;
static int[]iv;
static int n;

public static long val(int in,int w) {
	if(in==n||w<=0)
		return 0;
	if(iw[in]>w)
		return val(in+1,w);
	return Math.max(val(in+1,w),iv[in]+val(in+1,w-iw[in]));
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int w=sc.nextInt();
		iw=new int[n];
		iv=new int[n];
		for(int i=0;i<n;i++) {
			iw[i]=sc.nextInt();
			iv[i]=sc.nextInt();
		}
		System.out.println(val(0,w));
		
		
		sc.close();
	}

}
