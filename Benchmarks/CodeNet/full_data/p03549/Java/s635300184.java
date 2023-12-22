import java.util.*;
public class Main{
	static int power(int a, int k){
		int pow = 1;
		while(k!=0){
			if(k%2==0){
				a = a*a;
				k /= 2;
			}
			else {
				pow *= a;
				k -= 1;
			}
		}
		return pow;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println((100*n+1800*m)*power(2, m));
		System.out.println();
	}
}