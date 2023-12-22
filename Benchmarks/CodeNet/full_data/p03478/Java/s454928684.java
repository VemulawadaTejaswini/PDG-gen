import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a = sc.nextInt();
	int b = sc.nextInt();
	int sumN = 0;
	int ans = 0;
	int c = 0;
	for(int i = 1; i <= n; i++) {
		c = i;
		while(c > 0) {
			sumN += c % 10;
			c /= 10;
		}
		if(a <= sumN && sumN <= b) {
			ans += i;
		}
		sumN = 0;
	}
	System.out.println(ans);
}
}
