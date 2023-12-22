
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int q=sc.nextInt();
		for(int i=0; i<q; i++) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			int cnt=0;
			for(int k=l; k<=r; k+=2) {
				if(isprime(k) && isprime((k+1)/2)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}

	private boolean isprime(int p) {
		if(p==0||p==1) {
			return false;
		}
		if(p%2==0) {
			return true;
		}
		for(int i=3; i*i<=p; i+=2) {
			if(p%i==0) {
				return false;
			}
		}
		return true;
	}
}
