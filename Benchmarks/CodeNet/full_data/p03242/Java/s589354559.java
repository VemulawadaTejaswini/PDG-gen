
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int ans = 0;
		int b = 1;

		ArrayList<Integer> list = new ArrayList();
		while (n > 0) {
		    list.add(n % 10);
		    n /= 10;
		}

		for (int i = 0; i < 3; i++){
			if (list.get(i) == 9){
				ans += 1 * b;
			}else if (list.get(i) == 1){
				ans += 9 * b;
			}
			b *= 10;
		}
		System.out.println(ans);
	}
}