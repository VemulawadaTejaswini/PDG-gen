import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		
		int ans = 0;
		while(X <= Y) {
			ans++;
			X *= 2;
		}
		
		System.out.println(ans);
	}
	
}