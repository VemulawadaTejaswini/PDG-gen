
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x % 2 == 0 && x != 2)
			x++;
		while(true) {
			boolean flag = true;
			for(int i = 3; i < Math.sqrt(x); i = i + 2) {
				if(x % i == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				break;
			}
			x += 2;
		}
		System.out.println(x);
	}

}
