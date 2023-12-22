import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		int ans = 0;
		int temp = 0;
		for (int i = 0; i<n; i++) {
			if(s.charAt(i) == "I") {
				temp++;				
			} else {
				temp--;
			}
			if (ans<=temp) {
				ans=temp;
			}
		}
		System.out.println(ans);
	}

}