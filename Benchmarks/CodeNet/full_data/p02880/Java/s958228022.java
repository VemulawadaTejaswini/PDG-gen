import java.util.Scanner;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int res = 0;
			int []array1 = new int[]{1,2,3,4,5,6,7,8,9};
			int []array2 = new int[]{1,2,3,4,5,6,7,8,9};
			sc.close();
			for(int i = 0;i<9;i++) {
				for(int j = 0;j<9;j++) {
					if(n == (array1[i])*(array2[j])) {
						res++;
					}
				}
			}
			if(res>=1) 
				System.out.println("Yes");
			
			else
				System.out.println("No");
		}
	
	public static void main(String[] args) {
		solve();

	}

}
