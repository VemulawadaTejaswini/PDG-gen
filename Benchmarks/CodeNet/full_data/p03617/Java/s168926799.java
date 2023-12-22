import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve() {
		Scanner sc=new Scanner(System.in);
		int[] val=new int[4];
		double[] q=new double[4]; 
		for(int i=0;i<4;i++) {
			val[i]=sc.nextInt();
		}
		q[0]=0.25;
		q[1]=0.5;
		q[2]=1;
		q[3]=2;
		
		double n=sc.nextDouble();
		double[] valp=new double[4];
		valp[0]=val[0]*4;
		valp[1]=val[1]*2;
		valp[2]=val[2];
		valp[3]=val[3]/2;
		int[] id=new int[4];
		for(int i=0;i<4;i++) {
			id[i]=i;
		}
		for(int j=0;j<4;j++) {
			for(int i=0;i<4-1;i++) {
				if(valp[i]>valp[i+1]) {
					double temp=valp[i];
					valp[i]=valp[i+1];
					valp[i+1]=temp;
					
					int tempid=id[i];
					id[i]=id[i+1];
					id[i+1]=tempid;
				}
			}
		}

		long ans=0;
		for(int i=0;i<4;i++) {
			if(n>0) {
				ans+=(long)(n/q[id[i]])*val[id[i]];
				n=n%q[id[i]];
			}
		}
		System.out.println(ans);
	}
}
