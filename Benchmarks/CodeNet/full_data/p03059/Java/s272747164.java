
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();
		
		Double td = new Double(T + ".5");
		Double ad = new Double(A + "");
		Double atd = td/ad;
		int ati = atd.intValue();
		int result = ati*B;
		System.out.println(result);
	}

}
