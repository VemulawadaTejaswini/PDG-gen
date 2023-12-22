import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] x=new int[m];
		int[] y=new int[m];
		int[] BallCount=new int[n+1];
		double[] possibility=new double[n+1];
		
		for(int i=0;i<m;i++){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		possibility[1]=1;
		Arrays.fill(BallCount, 1);
		for(int i=0;i<m;i++){
			double p;
			if(possibility[x[i]]==0)p=0;
			else p=(double)1/(double)BallCount[x[i]];
			BallCount[x[i]]-=1;
			BallCount[y[i]]+=1;
			
			double temp=possibility[x[i]];
			possibility[x[i]]=(1-p)*possibility[x[i]];
			possibility[y[i]]=p*temp;
		}
		int BallBox=0;
		for(int i=1;i<=n;i++){
			if(possibility[i]==1){
				System.out.println(1);
				return;
			}
			if(possibility[i]>0)BallBox++;
		}
		System.out.println(BallBox);
		
	}

}