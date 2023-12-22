import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double a = 0;
		double ans = 0;
		for(int i = 0;i < n;i++) {
			a = sc.nextDouble();
			ans += 1 / a;
		}
		ans = 1/ans;
		System.out.println(ans);
		
	}

}
