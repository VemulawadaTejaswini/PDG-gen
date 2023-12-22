import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String ans = "No";
			int check = 0;
			String[] array = new String[n];
			for(int i = 0;i<n;i++) {
				array[i] = sc.next();
			}
			sc.close();
			for(int i = 0;i<n-1;i++) {
					if(array[i].charAt(array[i].length()-1)==array[i+1].charAt(0)) {
						for(int j = i;j>=0;j--) {
							if(array[j]!=array[i]) {
								check++;
						System.out.println(check);
						}
					}
				}
			}
			if(check == n*3+1) {
				ans = "Yes";
			}
			System.out.println(ans);
			
		}
	public static void main(String[] args) {
		solve();

	}

}
