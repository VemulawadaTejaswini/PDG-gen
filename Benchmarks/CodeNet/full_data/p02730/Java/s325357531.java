import java.util.Scanner;

public class Main {
	

	public static boolean check(String k,int i,int j) {
		
		while(i<j) {
			if(k.charAt(i)!=k.charAt(j))
				return false;
			i++;
			j--;
			
		}
		return true;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		int n = s1.length();
		
		if(check(s1,0,n-1) && check(s1,0,(n-1)/2-1) && check(s1,(n+1)/2,n-1)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
}