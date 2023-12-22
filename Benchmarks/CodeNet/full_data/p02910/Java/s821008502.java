import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		boolean easy = true;
		for(int i=0; i<s.length; i++)
			if(s[i]==(i%2==0 ? 'L' : 'R'))
				easy = false;
		
		System.out.println(easy ? "Yes" : "No");
		sc.close();
	}
}
