import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int l = sc.nextInt();
			int sum = 0;
			int[] array = new int[n];
			for(int i = 0;i<n;i++) {
				array[i] = l+i;
				sum+=array[i];
			}
			int min = array[0];
			for(int num : array) {
				if(num>0) {
				if(num<=min) 
					min = num;
				if(num == 0) {
					min = 0;
					break;
				}
				}
				else if(num<0) {
					if(num>=min) 
						min = num;
				}
				if(num == 0) {
					min = 0;
					break;
				}
			}
			System.out.println(sum-min);
			
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
