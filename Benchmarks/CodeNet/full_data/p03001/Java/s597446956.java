import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y =  sc.nextInt();
		sc.close();
		String s = String.valueOf(W * H / 2);
		BigDecimal bd = new BigDecimal(s);
		if(x* 2== W && y * 2 == H) {
			System.out.println(bd +" "+"1");
		}else {
			System.out.println(bd +" "+"0");
		}
	}
}