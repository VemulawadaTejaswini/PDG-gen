import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String n = "keyence";
		String S = sc.nextLine();
		
		int count=0;
		for(int i=0;i<n.length();i++) {
			for(int j=0;j<S.length();j++) {
				if(n.charAt(i) == S.charAt(j)) count++;
			}
		}
		
		if(count == n.length()) {
			System.out.println("YES");
		}
		else 
		{
			System.out.println("NO");
		}

	}

}