import java.util.Scanner;
 
class Main {
	int n;
	int[] d;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		d = new int[n];
		for(int i=0;i<n;i++){
			d[i] = sc.nextInt();
		}
	}
	void solve(){
		boolean[] cnt = new boolean[100];
		for(int i=0;i<n;i++){
			cnt[d[i]-1] = true;
		}
		int dan = 0;
		for(boolean f : cnt){
			if(f) dan++;
		}
		System.out.println(dan);
	}
}