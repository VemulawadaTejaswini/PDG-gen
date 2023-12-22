import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans[] = {"Christmas", "Christmas Eve", "Christmas Eve Eve", "Christmas Eve Eve Eve"};
		
		int d;
		d = sc.nextInt();
		sc.close();
		
		System.out.println(ans[25-d]);
	}

}
