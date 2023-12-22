import java.util.Scanner;

public class Main {
	public static int dig;
	public static int ans;
	public static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ans = 0;
		dig = dig(n);
		for (int i = 3; i < dig; i++) {
			ans += (int)(Math.pow(3,i)-Math.pow(2,i)*3+3);
		}
		System.out.println(ans);
		dfs(0,0);
		System.out.println(ans);
		sc.close();
	}
	public static int dig(int l) {
		int dig = 0;
		while(l > 0) {
			l = l/10;
			dig++;;
		}
		return dig;
	}
	public static void dfs(int x, int d) {
		if(d < dig) {
			dfs(x*10+3,d+1);
			dfs(x*10+5,d+1);
			dfs(x*10+7,d+1);
		}else if(d == dig){
			if(x <= n) {
				int[] is = new int[3];
				String s = String.valueOf(x);
				for (int i = 0; i < dig; i++) {
					if(s.charAt(i)=='3')is[0] = 1;
					else if(s.charAt(i)=='5')is[1] = 1;
					else if(s.charAt(i)=='7')is[2] = 1;
				}
				if((is[0]==1)&&(is[1]==1)&&(is[2]==1))ans++;
			}

		}
		return;
	}
}