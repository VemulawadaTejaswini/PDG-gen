import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		
		int result;
		if(k%2 == 0) {
			result = a-b;
		}else {
			result = b-a;
		}
		
		System.out.println(result);
		
	}
	
}
