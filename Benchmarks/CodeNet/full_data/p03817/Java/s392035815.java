import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long ans = x / 11;
		x -= ans * (long)11;
		ans = ans << 1;
		if(x > 6) ans += 2;
		else if(x >= 1) ans++;
		System.out.println(ans);
	}
}