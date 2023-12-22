
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		if(h%2!=0){throw new Exception("error");}
		else {
			System.out.println((a+b)/2*h);
		}
	
	}
}