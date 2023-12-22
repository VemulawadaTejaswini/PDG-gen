import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		for(;x>1;x--) {
			for(int i=2;i < x; i++) {

				int n = i;

				if(n*n > x) break;

				while(n < x) {
					n *= n;
					if(n==x) {
						System.out.println(x);
						return;
					}
				}

			}
		}
		System.out.println(x);
	}
}
