import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long mod = x % 11;
		
		long ans = (x / 11) * 2 + (mod == 0 ? 0 : (mod < 6 ? 1 : 2));
		System.out.println(ans);
		
		sc.close();
	}
	
}

