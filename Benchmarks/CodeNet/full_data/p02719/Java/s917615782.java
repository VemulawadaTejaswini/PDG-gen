import java.util.*;
import java.lang.Math;

class Main{
	public static void main(String args[]){
		int n, k;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		k = scanner.nextInt();
		if(n == k){
			System.out.println(0);
		}
		else if(n > k){
			int reminder = n % k;
			while(Math.abs(reminder - k) < reminder){
				reminder = Math.abs(reminder - k);
			}
			System.out.println(reminder);
		}
		else{
			if(k % n == 0){
				System.out.println(n);
			}
			else{
				while(Math.abs(k - n) < n){
					n = (Math.abs(k - n));
				}
				System.out.println(n);
			}
		}
		
	}
}