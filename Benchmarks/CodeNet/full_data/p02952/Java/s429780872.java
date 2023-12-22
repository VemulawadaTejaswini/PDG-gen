import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= n; i++){
			if(isOddDigit(i)){
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	public static boolean isOddDigit(int a){
		int num = a, count1 = 0;
		while(a != 0){
			int rem = a % 10;
			count1++;
			a /= 10;
		}
		if(count1 % 2 != 0){
			return true;
		}
		return false;
	}

	}