import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 入力を受け取る
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[n];
		for(int i = 0; i < n; i++)
			p[i] = sc.nextInt();
		
		
		int count = 0;
		while(true){
			
			for(int i = 0; i < n; i++){
				if(p[i] != i + 1)
					break;
				if(i == n - 1){
					System.out.println(count);
					System.exit(0);
				}
			}

			
			// hnは高い項の数 lnは低い項の数 h[]は高い項 l[]は低い項
			int hn = 0, ln = 0;
			int h[] = new int[n];
			int l[] = new int[n];
			
			// ソートする
			for(int i = 0; i < n; i++){
				int maxj  = 0;
				for(int j = 0; j <= i; j++)
					maxj = p[maxj] <= p[j] ? j : maxj;
				if(maxj == i){
					h[hn] = p[i];
					hn++;
				}
				else{
					l[ln] = p[i];
					ln++;
				}
			}
			for(int i = 0; i < ln; i++)
				p[i] = l[i];
			for(int i = ln; i < ln + hn; i++)
				p[i] = h[i - ln];
			count++;
		}
	}

}
