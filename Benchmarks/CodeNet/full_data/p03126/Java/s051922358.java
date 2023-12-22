import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int []k = new int [m];

		for(int i=0;i<n;i++) {
			int kn = Integer.parseInt(sc.next());
			for(int j=0;j<kn;j++) {
				int ryouri = Integer.parseInt(sc.next());
				k[ryouri-1]++;
			}
		}
		sc.close();
		int cnt = 0;
		for(int i=0;i<m;i++) {
			if(k[i]==n) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
