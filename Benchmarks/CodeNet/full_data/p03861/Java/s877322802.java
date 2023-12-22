import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long x = scan.nextLong();
		scan.close();

		long cnt=0;
		for(long i=a;i<=b;i++) {
			if(i%x==0)cnt++;
		}
		System.out.println(cnt);
	}
}