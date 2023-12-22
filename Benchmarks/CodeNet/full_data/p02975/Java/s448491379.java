
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		Set <Integer>hs = new HashSet<Integer>();
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			hs.add(a[i]);
		}
		sc.close();
		
		if(hs.size() > 3) {
			System.out.println("No");
			return;
		}
		if(n % 3 != 0 && hs.size() != 1) {
			System.out.println("No");
			return;
		}
		
		int []b = new int [hs.size()];
		int []c = new int [hs.size()];
		int id = 0;
		
		for(int num : hs) {
			c[id] = num;
			for(int i = 0 ; i < n ;i++) {
				if(a[i] == num) {
					b[id]++;
				}
			}
			id++;
		}
		
		if(hs.size() == 1) {
			if(c[0] == 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		else if(hs.size() == 2) {
			if((b[0] == b[1] * 2) &&(c[0]^c[0]) == c[1]|| ((b[1] == b[0]*2) &&(c[1]^c[1]) == c[0] )) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		else {
			if((b[0] == b[1])&&(b[1] == b[2])&&(c[0]^c[1]) == c[2]) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
