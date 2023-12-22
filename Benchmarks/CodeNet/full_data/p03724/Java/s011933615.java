
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int n;
	int[] count;
	void solve(){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		count=new int[n+1];
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			count[a]++;
			count[b]++;
		}
		for(int i=1;i<=n;i++){
			if(count[i]%2!=0){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
