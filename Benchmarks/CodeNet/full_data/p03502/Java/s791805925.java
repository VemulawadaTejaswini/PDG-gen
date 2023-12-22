import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x = 0;
		int sum = 0;
		
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		if(1 <= n && n <= Math.pow(10, 8)){
			x = n;
		}
		sn.close();
		sum = calc(x);
		
		if( x % sum == 0){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
	public static int calc(int x){
		int sum = 0;
		String xStr = Integer.toString(x);
		int k = xStr.length();
		while(k != 0){
			String c = xStr.substring(k-1, k);
			sum = sum + Integer.parseInt(c);
			k--;
		}
		return sum;
	}
}