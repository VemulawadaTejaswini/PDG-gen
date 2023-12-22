
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int c[] = new int[n];
		int s[] = new int[n];
		int f[] = new int[n];
		for(int i=0; i<n-1; i++) {
			c[i]=sc.nextInt();
			s[i]=sc.nextInt();
			f[i]=sc.nextInt();
		}

		ArrayList<Long> ans = new ArrayList<>();
		for(int i=0; i<n; i++) {
			long t = 0;
			t += s[i];
			t += c[i];
			for(int j=i+1; j<n-1; j++) {
				if(t<s[j]) {
					t= s[j];
				}else if(t%f[j]!=0) {
					t += f[j]-(t%f[j]);
				}
				t += c[j];
			}
			ans.add(t);
		}
		for(int i=0; i<n; i++) {
			System.out.println(ans.get(i));
		}
		sc.close();
	}
}
