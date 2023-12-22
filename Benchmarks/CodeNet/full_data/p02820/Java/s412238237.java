import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int r = Integer.parseInt(sc.next());
		int s = Integer.parseInt(sc.next());
		int p = Integer.parseInt(sc.next());
		String[] t = sc.next().split("");


		for(int i = 0 ; i < n -k ; i++ ) {
			if(t[i].equals(t[i + k])) {
				
				if(i+k+k < n) {
					
					if(t[i].equals(t[i+k+k])) {
						t[i+k] = "N";
						continue;
					}
				

				}
				
				t[i] = "N";
			}
			
		}
		
		
		int ans = 0;
		String aa= "";
		for(int i = 0 ; i < n ; i++) {
			switch(t[i]) {
			case "r":
				ans += p;

				break;

			case "s":
				ans += r;
				
				break;

			case "p":
				ans += s;
				
				break;
			}
			
		}
		System.out.println(ans);
	}

}