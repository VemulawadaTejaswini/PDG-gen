
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		Set <Integer> hs = new HashSet <Integer>();
		
		for(int i = 0 ; i < n ;i++) {
			int a = Integer.parseInt(sc.next());
			hs.add(a);
		}
		sc.close();
		
		if(hs.size() != 3 || n % 3 != 0) {
			System.out.println("No");
			return;
		}
		
		int []b = new int [3];
		int i = 0;
		
		for(int num :hs) {
			b[i] = num;
			i++;
		}
		
		if((b[0]^b[1]) == b[2]) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
