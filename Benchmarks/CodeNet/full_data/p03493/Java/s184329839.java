import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int count = 0;
		
		if(a.substring(0,1).equals("1")) {
			count++;
		}
		
		if(a.substring(1,2).equals("1")) {
			count++;
		}
		
		if(a.substring(2,3).equals("1")) {
			count++;
		}
		
		System.out.println(count);
		
		
		sc.close();
	}
}
