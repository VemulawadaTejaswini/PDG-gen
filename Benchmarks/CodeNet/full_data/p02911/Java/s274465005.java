import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int ans[] = new int[n];
		for(int m = 0; m < n;m++) {
			ans[m] = k;
		}
		for(int i = 0; i < q;i++) {
			int a = sc.nextInt();
			for(int m = 0; m < n;m++) {
				if(m != a-1) {
					ans[m]--;
				}
			}
			
		}
		for(int m = 0; m < n;m++) {
			if(ans[m]>0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}
