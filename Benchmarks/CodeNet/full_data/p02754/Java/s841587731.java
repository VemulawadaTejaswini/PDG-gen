import java.util.*;

public class Main{
	public static void main(String[] atgs){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int b = scan.nextInt();
		int r= scan.nextInt();

		int shou = N / (b+ r);
		int amari = N % (b+ r);

		if (b == 0) {
			System.out.println(0);
		}else{
			int ans = shou * b + amari;
			System.out.println(ans);
		}

	}
}