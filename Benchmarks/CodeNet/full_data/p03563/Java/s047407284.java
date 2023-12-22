import java.util.Scanner;

public class Main{



	public static void main(String[] args){




		Scanner sc =  new Scanner(System.in);
		int R = sc.nextInt();
		int G = sc.nextInt();
		int ans = 0;
		ans = 2*G-R;
		System.out.println(ans);
	}
}