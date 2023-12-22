
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int n;
	char s[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.next().toCharArray();
		int x[] = new int[n+1];
		int min = 0;
		String ans ="";
		for(int i=0; i<n; i++) {
			if(s[i]=='(') {
				x[i+1]=x[i]+1;
			}else {
				x[i+1]=x[i]-1;
			}
			min = Math.min(min, x[i+1]);
			ans += s[i];
		}
		while(min<0) {
			ans = "("+ans;
			x[n]++;
			min++;
		}
		while(x[n]>0) {
			ans = ans + ")";
			x[n]--;
		}
		System.out.println(ans);
		sc.close();
	}


}


