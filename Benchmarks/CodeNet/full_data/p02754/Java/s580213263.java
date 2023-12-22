import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long N = Integer.parseInt(scan.next());
		long b = Integer.parseInt(scan.next());
		long r = Integer.parseInt(scan.next());

		if (b == 0) {
			System.out.println(0);
		}else{
			long shou = N / (b+ r);
			long amari = N % (b+ r);
			long ans = shou * b + amari;
			System.out.println(ans);
		}

	}
}