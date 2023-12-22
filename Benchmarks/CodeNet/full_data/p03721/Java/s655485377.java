
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int n;
	long k;
	void solve(){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextLong();
		int[]a=new int[n];
		int[]b=new int[n];
		Pair[] p=new Pair[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			p[i]=new Pair(a[i],b[i]);
		}
		Arrays.sort(p);
		for(int i=0;i<n;i++){
			k-=p[i].b;
			if(k>0)continue;
			else{
				System.out.println(p[i].a);
				return;
			}
		}
	}
	class Pair implements Comparable<Pair>{
		int a;
		int b;
		Pair(int a,int b){
			this.a=a;
			this.b=b;
		}
		
		public int compareTo(Pair o){
			return this.a-o.a;
		}
	}
}
