import java.util.Scanner;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int check = 0;
			int[] array = new int [n];
			int res = 0;
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextInt();
			}
			for(int i = n-1;i>=0;i--) {
				for(int j = i-1;j>=0;j--) {
					if(array[i]>=array[j]) {
							check++;
						if(check>=j) {
							res++;
							check = 0;
						}
					}
				}	
			}
			System.out.println(res-1);
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}