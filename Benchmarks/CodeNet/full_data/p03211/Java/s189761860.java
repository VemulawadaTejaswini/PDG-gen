import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int len = s.length();
		
		int min = 900;
		
		for(int i = 0; i < len - 2; ++i) {
		    String sub = s.substring(i, i + 3);
		    int n = Integer.parseInt(sub);
		    
		    if(min > Math.abs(n - 753)) min = Math.abs(n - 753);
		    else continue;
		}
		
		System.out.println(min);
	}
}