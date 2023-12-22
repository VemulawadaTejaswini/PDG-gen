import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;

		for (int i = 1; i <= n; i++) {
			int currentSum =0;
			if(i>=1){
				currentSum += i%10;
				if(i/10>=1){
					currentSum += (i/10)%10;
					if(i/100>=1){
						currentSum += (i/100)%10;
						if(i/1000>=1){
							currentSum += (i/1000)%10;
							if(i/10000>=1){
								currentSum += (i/10000)%10;
							}
						}
					}
				}
			}
			// System.out.println("i "+i);
			// System.out.println("currentSum "+currentSum);
			if(currentSum>=a&& currentSum <=b){
				result += i;
			}
		}
		System.out.println(result);


	}
}
