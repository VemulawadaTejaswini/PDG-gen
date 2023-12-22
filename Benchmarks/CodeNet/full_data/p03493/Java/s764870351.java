import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = 0;

		for(int i = 0;i < 3; i++) {
			if(str.charAt(i) == '1') {
				n += 1;
			}else {
				n += 0;
			}
		}
		System.out.println(n);

	}

}
