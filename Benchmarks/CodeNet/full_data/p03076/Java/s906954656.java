import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int ans = 0;
		ans += (a/10+(a%10==0?0:1))*10;
		ans += (b/10+(b%10==0?0:1))*10;
		ans += (c/10+(c%10==0?0:1))*10;
		ans += (d/10+(d%10==0?0:1))*10;
		ans += (e/10+(e%10==0?0:1))*10;
		int min = Math.min(a%10==0?999:a%10,Math.min(b%10==0?999:b%10,Math.min(c%10==0?999:c%10,Math.min(d%10==0?999:d%10,e%10==0?999:e%10))));
		System.out.print(ans-(10-min));
	}
}
