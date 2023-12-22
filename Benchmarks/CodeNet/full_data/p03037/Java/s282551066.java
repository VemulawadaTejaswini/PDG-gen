import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Gates g = new Gates(n);
		for(int i = 0; i < m; i++){
			int l = sc.nextInt();
			int r = sc.nextInt();
			g.check(l, r);
		}
		g.printAns();
	}
}
class Gates{
	int l = 1;
	int r;
	Gates(int n){
		this.r = n;
	}
	void check(int l, int r){
		if(this.l < l){
			this.l = l;
		}
		if(this.r > r){
			this.r = r;
		}
	}
	void printAns(){
		int ans = 0;
		if(l <= r){
			ans = r - l + 1;
		}
		System.out.println(ans);
	}
}
