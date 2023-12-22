import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] d = new boolean[10];
		
		for(int i = 0; i < k; i++) {
			d[sc.nextInt()] = true;
		}
		sc.close();
		
		int ans;
		for(int i = 1; i <= 10000; i*=10) {
			if(n <= i) break;
			int l = (n%(i*10))/i;
			while(d[l]) {
				n += i;
				l = (n%(i*10))/i;
			}
		}
		
		System.out.println(n);
	}
	
}