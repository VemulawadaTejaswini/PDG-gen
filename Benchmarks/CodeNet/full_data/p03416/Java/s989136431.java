import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		
		for(int i = a; i <= b; i++){
			int x = a % 10;
			int y = a / 10000 % 10;
			int p = a / 100 % 10;
			int q = a / 1000 % 10;
			if (x == y && p == q){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
