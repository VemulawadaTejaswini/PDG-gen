import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			String str = String.valueOf(i);
			String strArr[] = str.split("");
			int sum1 = 0;
			for(int j = 0; j < strArr.length; j++) {
				int intStrArr = Integer.parseInt(strArr[j]);
				sum1 += intStrArr;
			}
			if(a <= sum1 & sum1 <= b) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
	
}