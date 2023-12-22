import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int ans = 3;
		if(1==a/b) ans--;	
		if(1==a/c) ans--;
		if(1==b/c) ans--;
		System.out.println(ans);
	}
}