import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		long ans = 0;
		
		ans += w * h - 2 * ( w + h - 2);
		
		System.out.println(Math.abs(ans));
		

	}

}
