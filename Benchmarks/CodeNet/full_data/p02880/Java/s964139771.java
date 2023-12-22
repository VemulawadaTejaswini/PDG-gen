import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean b = false;
		if(n < 82) {
			for(int i = 1;i <= 9;i++) {
				for(int k = 1; k <= 9;k++) {
					if(n == i * k) {
						b = true;
						break;
					}
				}
			}
		}
		if(b) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
