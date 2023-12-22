import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long num = sc.nextInt();
		long n = 1, next1, next2, ten = 1;
		boolean ereg = false;
		while(num > 0){
			System.out.println(n);
			if(ereg) {
				n += ten/10;
				ereg = false;
				num--;
				continue;
			}
			if(n/ten == 9) {
				ten *= 10;
			}
			next1 = n+ten;
			next2 = n+ten-(ten/10);
			if(next1 == next2) {
				num--;
				n = next1;
				continue;
			}
			if(next2 * getS(next1) <= next1*getS(next2)) {
				n = next2;
				ereg = true;
				num--;
				continue;
			}
			n = next1;
			num--;
		}
	}
	public static long getS(long n) {
		long ret = 0;
		while(n>0) {
			ret += n % 10;
			n /= 10;
		}
		return ret;
	}
}