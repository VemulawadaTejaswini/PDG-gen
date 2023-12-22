import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		sc.close();
		String ans[] = { "Yes", "No"};
		int a = 0;
		int r = n % 2;
		r = (n / 2) + r;
		if(r < k)a = 1;
		System.out.println(ans[a]);
	}

}
