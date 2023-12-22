import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a*b/2!=0&&a*b<=3) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}