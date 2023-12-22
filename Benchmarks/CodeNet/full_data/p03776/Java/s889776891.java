
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	int N;
	int A,B;
	long [][]c=new long[51][51]; //c[n][k]=nCk
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		A=sc.nextInt();
		B=sc.nextInt();
		
		Long[] v=new Long[N];
		
		for(int i=0;i<N;i++){
			v[i]=sc.nextLong();
		}

		Arrays.sort(v,Comparator.reverseOrder());
		
		double max_Ave=0;
		for(int i=0;i<A;i++){
			max_Ave+=(double)v[i]/A;
		}
		
		System.out.println(max_Ave);
		
		if(v[0]==v[A-1]){
			int X=0;
			for(int i=0;i<N;i++){
				if(v[i]==v[0])X++;
			}
			
			long sum=0;
			com_table(N);
			for(int i=A;i<=B;i++){
				sum+=c[X][i];
			}
			System.out.println(sum);
		}else{
			int X=0;
			int Y=0;
			for(int i=0;i<N;i++){
				if(v[i]==v[0])X++;
			}
			for(int i=0;i<A;i++){
				if(v[i]==v[0])Y++;
			}
			com_table(N);
			
			System.out.println(c[X][Y]);
		}
	}
	
	void com_table(int N){
		for(int i=0;i<=N;i++){
			for(int j=0;j<=i;j++){
				if(j==0 || j==i)c[i][j]=1;
				else{
					c[i][j]=c[i-1][j]+c[i-1][j-1];
				}
			}
		}
	}
}