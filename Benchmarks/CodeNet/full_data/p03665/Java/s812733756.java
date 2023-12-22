import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int P = input.nextInt();
		int numEven = 0;
		int numOdd = 0;
		long ans = 0;
		long chooseAns = 0;
		for (int i = 0; i < N; i++) {
			int x = input.nextInt();
			if (x%2==0) numEven++;
			else numOdd++;
		}
		ans++;
		for (int i = 0; i < numEven; i++) { //Any subset of even numbers is good
			ans*=2;
		} //Subset answer
		if (P==0) {
			for (int choose = 2; choose <= numOdd; choose+=2) { //Subsets of even number of odds
				int diff1 = choose;
				int diff2 = numOdd-choose;
				int numMultiply = Math.min(diff1, diff2);
				long curAns = 1;
				for (long factor = numOdd; factor > numOdd-numMultiply; factor--) {
					curAns*=factor;
				}
				for (long i = 1; i <= numMultiply; i++) {
					curAns/=i;
				}
				chooseAns+=curAns;
			}
			chooseAns++; //Empty set considered
			ans*=chooseAns;
		}else {
			for (int choose = 1; choose <= numOdd; choose+=2) { //Subsets of odd number of odds
				int diff1 = choose;
				int diff2 = numOdd-choose;
				int numMultiply = Math.min(diff1, diff2);
				long curAns = 1;
				for (long factor = numOdd; factor > numOdd-numMultiply; factor--) {
					curAns*=factor;
				}
				for (long i = 1; i <= numMultiply; i++) {
					curAns/=i;
				}
				chooseAns+=curAns;
			} //Empty set actually fails this condition since >= 1 odd is needed for odd sum
			ans*=chooseAns;
		}
		System.out.println(ans);
	}	
}
