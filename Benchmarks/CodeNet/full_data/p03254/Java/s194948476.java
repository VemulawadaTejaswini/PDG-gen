import java.util.Arrays;
import java.util.Scanner;
 
class Main {
	int n;
	int x;
	int[] a;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		x = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
	}
	void solve(){
		Arrays.sort(a);
		int cnt = 0;
		while(x>0&&cnt<n){
			x-=a[cnt];
			cnt++;
		}
		if(x!=0){
			cnt--;
		}
		System.out.println(cnt);
	}
}