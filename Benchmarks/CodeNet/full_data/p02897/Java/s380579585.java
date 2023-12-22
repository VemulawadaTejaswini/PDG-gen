import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		double half = n / 2;

		if (n % 2 == 0) {
			System.out.println(half / n);
		} else {
			System.out.println((half + 0.5) / n);
		}
	}
}
