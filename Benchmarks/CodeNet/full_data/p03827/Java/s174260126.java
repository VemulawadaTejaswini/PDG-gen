
import java.util.*;	
public class Main {

	public static void main(String[] args) {
		int x = 0,max = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String c = sc.next();
		for(int i = 0;i < c.length();i++ ) {
			if(c.charAt(i) == 'I') x++;
			else if(c.charAt(i) == 'D') x--;
			if(max < x)max = x;
		}
		System.out.println(max);
	}

}
