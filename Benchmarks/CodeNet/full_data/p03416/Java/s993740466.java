import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int p = 0;

		for(int i = 0; i <= B-A; i++) {
			String str = String.valueOf(A+i);
			if(str.charAt(0) == str.charAt(4)
					&& str.charAt(1) == str.charAt(3)) {
				p += 1;
			}
		}
		System.out.println(p);

	}

}