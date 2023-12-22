import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  Integer.parseInt(sc.next());
		String s[] =  sc.next().split("");
		
		int ans = 1;
		String a = s[0];
		for (int i = 1 ; i < n ; i++) {
			if(a.equals(s[i])) {
				continue;
			}
			
			ans++;
			a = s[i];
		}
				
		System.out.println(ans);
	}
}
