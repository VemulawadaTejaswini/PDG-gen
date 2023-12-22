import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String[] s1 = sc.next().split("");
		String[] s2 = sc.next().split("");
		
		
		String ans = "";
		for(int i = 0 ; i < n; i++) {
			
			ans += s1[i];
			ans += s2[i];
		}
		
		
		System.out.println(ans);
		
	}



}
