import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int result =0;
		int minTime =10;

		int aResult = result(a);
		int bResult = result(b);
		int cResult = result(c);
		int dResult = result(d);
		int eResult = result(e);

		minTime = Math.min(minTime, a%10==0?10:a%10);
		// System.out.println(minTime);
		minTime = Math.min(minTime, b%10==0?10:b%10);
		// System.out.println(minTime);
		minTime = Math.min(minTime, c%10==0?10:c%10);
		// System.out.println(minTime);
		minTime = Math.min(minTime, d%10==0?10:d%10);
		// System.out.println(minTime);
		minTime = Math.min(minTime, e%10==0?10:e%10);
		// System.out.println(minTime);
		if(minTime==10){
			minTime=10;
		}

		result += aResult;
		// System.out.println(result);
		result += bResult;
		// System.out.println(result);
		result += cResult;
		// System.out.println(result);
		result += dResult;
		// System.out.println(result);
		result += eResult;
		// System.out.println(result);
		result += minTime-10;
		System.out.println(result);

	}

	private static int result(int a) {
	if(a%10!=0){
		return a/10 *10 +10;
	}
	return a;
	}
}

