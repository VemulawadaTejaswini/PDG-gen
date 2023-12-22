import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, a[], key = -1;
		
		n = sc.nextInt();
		
		a = new int[n + 1];
		
		for(int i = 1; i < n + 1; ++i) {
			a[i] = sc.nextInt();
			if(a[i] == 2)key = i;
		}
		sc.close();
		
		int ans = -1;
		
		boolean light[];
		light = new boolean[n + 1];
		
		if(key == 1) {
			ans = 1;
		}
		else if(key != -1) {
			ans = 1;
			int b = a[1];
			light[1] = true;
			light[b] = true;
			while(true) {
				if(b == key) {
					++ans;
					break;
				}
				b = a[b];
				++ans;
				if(light[b]) {
					ans = -1;
					break;
				}
				light[b] = true;
			}
		}
		System.out.println(ans);
	}

}
