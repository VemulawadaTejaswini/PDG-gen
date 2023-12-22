import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int ans = 0;
		int digits = (int)Math.log10((double)n);
		int numFirst = (int)(n/(Math.pow(10, digits)));
		ans = digits * 9;
		boolean flag = false;
		while(n>10){
			if(!(n%10 == 9)){
				ans += numFirst - 1;
				flag = true;
				break;
			}
			n /= 10;
		}
		if(flag == false){
			ans += numFirst;
		}
		System.out.println(ans);
	}
}