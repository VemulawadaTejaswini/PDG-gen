import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int result;
		if(x == 2) {
			result = x;
		}
		else {
			int count = x;
			while(true) {
				if(isPrime(count)) {
					result = count;
					break;
				}
				count++;
			}
		}
		System.out.println(result);
	}
	public static boolean isPrime(int x) {
		if(x%2==0) {
			return false;
		}
		for(int i = 2; i*i <= x; i++) {
			if((x % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
}