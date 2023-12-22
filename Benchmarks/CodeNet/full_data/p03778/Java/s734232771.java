
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int wa = w+a, wb = w+b, diff = b-a;
		int result = 0;
		if(-w <= diff && diff <= w) {
			result = 0;
		}else {
			if(diff > 0) {
				result = b-wa;
			}else {
				result = a-wb;
			}
		}
		System.out.println(result);
	}
}
