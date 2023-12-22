import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int b[] = new int[m];
		for(int i = 0; i < m; i++){
			b[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i < n; i++){
			int tmp = c;
			for(int j = 0; j < m; j++){
				int s = sc.nextInt();
				tmp += s*b[j];
			}
			if(tmp > 0)ans++;
		}
		System.out.print(ans);
	}
}
