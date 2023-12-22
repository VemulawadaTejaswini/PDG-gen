import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		
		for(int i=1;i<=k;i++) {
			if(a>0) {
				a-=1;
			}else if(b>0) {
				b-=1;
			}else {
				
			}
		}
		System.out.printf(a+""+b);
		sc.close();
	}
}