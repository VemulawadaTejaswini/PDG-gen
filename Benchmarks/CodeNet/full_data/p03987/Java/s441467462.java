import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;++i){
			a[i]=sc.nextInt();
		}
		TreeSet<Integer> seen=new TreeSet<>();
		seen.add(-1);
		seen.add(n);
		int[] w=new int[n];
		for(int i=0;i<n;++i){
			w[a[i]-1]=i;
		}
		long res=0;
		for(int i=0;i<n;++i){
			seen.add(w[i]);
			int prev=seen.headSet(w[i], false).last();
			int next=seen.tailSet(w[i], false).first();
			res+=(w[i]-prev)*(long)(next-w[i])*(i+1);
		}
		System.out.println(res);
	}
}