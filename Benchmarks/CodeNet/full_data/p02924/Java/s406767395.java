import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		int cnt = 0;
		if(n != 1) {
			cnt = n*(n-1)/2;
		}
		
		System.out.println(cnt);
	}
}
