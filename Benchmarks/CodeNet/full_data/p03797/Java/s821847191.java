import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long m = scanner.nextLong();

		long cnt=0;
		if(m>=2*n) {
			cnt=n;
			m-=2*n;
			n=0;
		}
		else {
			cnt=m/2;
			if(m%2==0) {
				m=0;
			}else {
				m=1;
			}
			n-=m/2;
		}
		cnt+=m/4;
		System.out.println(cnt);
	}
}
