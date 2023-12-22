import java.util.Scanner;

public class Main{
	static long mod = (long)10e9+7;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] c = sc.next().toCharArray();
		int[] alcount = new int['z' - 'a' + 1];
		for(int i = 0; i < c.length; i++) {
			alcount[(int)(c[i] - 'a')]++;
		}
		long ans = 1;
		for(int i = 0; i < alcount.length; i++) {
			if(alcount[i] == 0) continue;
			ans *= (long)alcount[i] + 1;
			ans %= mod;
		}
		System.out.println(ans - 1);
	}
}