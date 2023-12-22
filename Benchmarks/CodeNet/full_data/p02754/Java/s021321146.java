import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long N = scanner.nextLong();
		long b = scanner.nextLong();
		long r = scanner.nextLong();
		long res = N / (b+ r);
		long mod = N % (b+ r);

		if(r == 0){
			System.out.println(0);
		}else{
			if(mod > b){
				mod = b;
			}
			System.out.println(res*b + mod);
		}
	}
}