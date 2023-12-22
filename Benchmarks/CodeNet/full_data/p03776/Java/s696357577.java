
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		Long[] v=new Long[N];
		for(int i=0;i<N;i++){
			v[i]=sc.nextLong();
		}
		Arrays.sort(v,Comparator.reverseOrder());
		long sum=0;
		int ans=0;
		for(int i=0;i<A;i++){
			sum+=v[i];
		}
		System.out.println((double)sum/A);
		if(v[0]!=v[A-1]){
			int X=0;
			int Y=0;
			for(int i=0;i<N;i++){
				if(v[A-1]==v[i])X++;
			}
			for(int i=0;i<A;i++){
				if(v[A-1]==v[i])Y++;
			}
			ans+=combination(X,Y);
		}
		else if(v[0]==v[A-1]){
			int X=0;
			for(int i=0;i<N;i++){
				if(v[0]==v[i])X++;
			}
			for(int i=A;i<B;i++){
				ans+=combination(X,i);
			}
		}
		System.out.println(ans);
	}
	static long combination(long a,long b){
		if(a>b)return kaijou(a)/kaijou(a-b)/kaijou(b);
		else return kaijou(b)/kaijou(b-a)/kaijou(a);
	}
	static long kaijou(long n){
		long retval=1;
		for(int i=1;i<=n;i++)retval*=i;
		return retval;
	}
}
