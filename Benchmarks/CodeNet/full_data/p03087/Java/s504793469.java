import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		String s = sc.next();
		int cnt[] = new int[n];

		for(int i=1; i<n; i++) {
			if(s.substring(i-1, i+1).equals("AC")){
				cnt[i]=cnt[i-1]+1;
			}else {
				cnt[i]=cnt[i-1];
			}
		}

		for(int i=0; i<q; i++) {
			int l=sc.nextInt();
			l--;
			int r=sc.nextInt();
			r--;
			System.out.println(cnt[r]-cnt[l]);
		}
		sc.close();
	}

}
