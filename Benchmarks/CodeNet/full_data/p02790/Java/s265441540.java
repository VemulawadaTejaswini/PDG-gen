import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			int temp = a;
			a = b;
			b = temp;
		}

		String ans = "";
		for(int i=0; i<b; i++)
			ans += a;
		System.out.println(ans);

		sc.close();
	}
}
