import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String ans = "Yes";
			int check = 0;
			String[] array = new String[n];
			for(int i = 0;i<n;i++) {
				array[i] = sc.next();
			}
			sc.close();
			for(int i = 0;i<n-1;i++) {
				if(array[i].charAt(array[i].length()-1)!=array[i+1].charAt(0)) {
					ans = "No";
					break;
				}
						for(int j = i+1;j<n;j++) {
							if(array[i].equals(array[j])) {
								ans = "No";
								break;
							}
						}
						if("No".contentEquals(ans)) {
							break;
						}
				}
			System.out.println(ans);
			
		}
	public static void main(String[] args) {
		solve();

	}

}
