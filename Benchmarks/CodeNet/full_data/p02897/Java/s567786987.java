import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int a = sc.nextInt();
		
		if(a == 1) {
			System.out.printf("%.10f",1.0);
		} else {
			if (a%2 == 0) {
				System.out.printf("%.10f", 1.0/2.0);
			} else {
				System.out.printf("%.10f",(a/2+1.0)/a);
			}
		}
	}
}
