import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		char[] l= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		Scanner sc = new Scanner(System.in);
		
		String w = sc.nextLine();
		
		String ans = "Yes";
		
		if (w.length()%2 == 0) {
			char[] c = w.toCharArray();
			for (int i=0; i<l.length; i++) {
				int count = 0;
				for (int j=0; j<c.length; j++) {
					if (l[i] == c[j]) {
						count++;
					}
				}
				if (count%2 !=0) {
					ans = "No";
					break;
				}
			}
			
			
		} else {
			ans = "No";
		}
		
		System.out.println(ans);
		sc.close();
	}

}