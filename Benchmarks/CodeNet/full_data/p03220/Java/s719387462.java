import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int t = sc.nextInt();
			int a = sc.nextInt();
			int array[] = new int[n];
			int result = 0;
			double min = Double.MAX_VALUE; 
			for(int i = 0;i<n;i++) {
				array[i] = sc.nextInt();
				if(a<t-array[i]*0.006) {	
					double res = ((t-array[i]*0.006)-a);
					if(res<=min) {
						result = i;
						min = res;
					}
			}
				else if(a>t-array[i]*0.006) {
					double res = (int) (a-(t-array[i]*0.006));
					if(res<=min) {
						result = i;
						min = res;
					}
				}
			}
			System.out.println(result+1);
			sc.close();
		}
	public static void main(String[] args) {
		solve();

	}

}
