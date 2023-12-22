import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		
		for(int i = a; i <= b; i++){
			int x = i % 10;
			int y = i / 10000 % 10;
			int p = i / 10 % 10;
			int q = i / 1000 % 10;
			if (x == y && p == q){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
