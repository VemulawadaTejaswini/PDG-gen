import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final long N = sc.nextLong();
		
		long count = 0;
		
		count = 2 * (N/11);
		int rest = (int) (N%11);
//		System.out.println(count);
		if(rest ==0) {
			count +=0;
		}else if(rest<=6) {
			count +=1;
		}else {
			count +=2;
		}
		
		System.out.println(count);
		sc.close();
	}
}
