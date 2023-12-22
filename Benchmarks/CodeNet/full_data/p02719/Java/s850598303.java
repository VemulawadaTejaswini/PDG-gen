import java.util.*;
import java.lang.Math;

class Main{
	public static void main(String args[]){
		int n, k;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		k = scanner.nextInt();
		int reminder = n % k;
		while(Math.abs(reminder - k) < reminder){
			reminder = Math.abs(reminder - k);
		}
		System.out.println(reminder);
	}
}