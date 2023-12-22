import java.util.*;
public class Main {
//トレーニングキャンプ
	public static void main(String[] args) {
		int N, power = 1, ans;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 1; i <= N; i++)
		{
			power = power * i;
		}
		ans = power % (10^9+7);
		if(power < (10^9+7)) System.out.println(power);
		else System.out.println(ans);
	}

}
