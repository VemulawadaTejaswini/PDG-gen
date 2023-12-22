import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int r = Integer.parseInt(scan.next());

		if (b == 0) {
			System.out.println(0);
		}else{
			int shou = N / (b+ r);
			int amari = N % (b+ r);
			System.out.println(shou * b + amari);
		}
	}
}