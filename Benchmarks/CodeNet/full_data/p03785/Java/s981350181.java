import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int C=sc.nextInt();
		int K=sc.nextInt();
		int[]T=new int[N];
		for(int i=0;i<N;i++){
			T[i]=sc.nextInt();
		}
		Arrays.sort(T);
		
		int people=0;
		int limit=T[0]+K;
		int count=0;
		for(int i=0;i<N;i++){
			if(people==C){
				count++;
				people=0;
				limit=T[i]+K;
			}
			if(limit<T[i]){
				count++;
				people=0;
				limit=T[i]+K;
			}
			people++;
		}
		
		if(people>0){
			if(people%C==0)count+=people/C;
			else count+=people/C+1;
		}
		System.out.println(count);
		
	}
}