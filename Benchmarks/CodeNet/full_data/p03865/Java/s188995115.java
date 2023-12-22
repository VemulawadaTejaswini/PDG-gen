
import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		boolean tag = false;
		int length=0;
		for (int i = 1; i < str.length() - 1; i++) {
			if (c[i - 1] != c[i + 1]) {
				tag = true;
				break;
			}
		}
		if (tag == false) {
			System.out.println("Second");
		} else {
			int[] map = new int[256];
			for (char cc : c)
				map[cc]++;
			length = str.length() / 2;
			for (int i : map) {
				if (i >=length) {
					length=length-i;
					break;
				}
			}
			if (length<0){
				System.out.println("Second");
			}
			else if(length==0){
				if(c[0]==c[c.length-1]) System.out.println("First");
				else System.out.println("Second");
			}
			else{
				if (str.length() % 2 == 0)
					System.out.println("Second");
				else
					System.out.println("First");
			}
			
			
	
				
			
		}

	}
}
