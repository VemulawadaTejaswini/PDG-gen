import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		a+= sc.next();
		a+= sc.next();

		int i = Integer.parseInt(a);

		if(i % 4 ==0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}



	}

}
