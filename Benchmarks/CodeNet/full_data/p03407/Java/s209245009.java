import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		sc.close();
		String ans[] = { "Yes", "No"};
		int an = 0;
		if(a + b < c)an = 1;
		System.out.println(ans[an]);
	}

}
