import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		for (int i = (int)Math.ceil(Math.sqrt(n)); i > 0; i--) {
			if(n%i==0) {
				System.out.println(dig(n/i));
				break;
			}
		}
		sc.close();
	}
	public static long dig(long l) {
		long dig = 0;
		while(l > 0) {
			l = l/10;
			dig++;;
		}
		return dig;
	}
}