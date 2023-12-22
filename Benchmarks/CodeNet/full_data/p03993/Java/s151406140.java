import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt()-1;
		
		boolean[]checked=new boolean[n];
		int count=0;
		for(int i=0;i<n;i++) {
			if(checked[i])continue;
			if(a[a[i]]==i) {
				count++;
				checked[a[i]]=true;
			}
			checked[i]=true;
		}
		System.out.println(count);
	}
}