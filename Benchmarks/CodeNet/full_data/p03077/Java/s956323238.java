import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long[] p=new long[5];
		long N=sc.nextLong();
		p[0]=sc.nextLong();
		p[1]=sc.nextLong();
		p[2]=sc.nextLong();
		p[3]=sc.nextLong();
		p[4]=sc.nextLong();
		sc.close();
		int ans=0;
		ans +=cal(N,p[0]);
		for(int i=1;i<p.length;i++){
			if(p[i]<p[i-1]){
				ans +=cal(N,p[i]);
			}else{
				ans +=cal(N,p[i-1]);
			}
		}
		System.out.println(ans);
	}

	private static long cal(long N,long p){
		long ret=(long)Math.ceil(N/p);
		if(ret==0l){
			return 1;
		}else{
			return ret;
		}
	}
}
