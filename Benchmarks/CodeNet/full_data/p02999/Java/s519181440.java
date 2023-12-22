import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), a = sc.nextInt();
		sc.close();
		int ans[] = {0, 10};
		int an = 0;
		if(x >= a)an = 1;
		System.out.println(ans[an]);
	}
}
