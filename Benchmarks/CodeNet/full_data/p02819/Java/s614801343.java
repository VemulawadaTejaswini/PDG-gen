import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt() - 1;
		boolean key = true;
		while (key) {
			X++;
			key = checker(X);
		}
		System.out.println(X);
		
	}
	
	public static boolean checker(int x) {
		for (int i = 2; i <= x/2; i++) {
			if (x%i == 0) {
				return true;
			}
		}
		return false;
	}
}