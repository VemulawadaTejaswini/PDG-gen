import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		int ans = a/111;
		if(a%0 != 0) {
			ans+= 1;
		}
		
		System.out.println(ans);
	}

}
