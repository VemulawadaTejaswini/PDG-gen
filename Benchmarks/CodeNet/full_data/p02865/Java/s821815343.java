import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		if(f%2==1) {
			f++;
		}
		int ans = f/2-1;
		System.out.println(ans);
	}

}