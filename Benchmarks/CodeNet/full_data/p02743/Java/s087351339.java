import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		if(c-a-b > 0 && 4*a*b < (c-a-b)*(c-a-b)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}	
}