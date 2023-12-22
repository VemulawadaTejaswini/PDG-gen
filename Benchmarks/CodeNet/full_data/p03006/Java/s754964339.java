import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		int cnt=0;
		int max=0;

		for(int s=0;s<n;s++){
			for(int t=0;t<n;t++){
				if(s!=t){
					int p = x[t]-x[s];
					int q = y[t]-y[s];
					for(int u=0;u<n;u++){
						for(int v=0;v<n;v++){
							if((x[v]-x[u]==p)&&(y[v]-y[u]==q))cnt++;
						}
					}
					max = Math.max(max,cnt);
					cnt=0;
				}
			}
		}

		// 出力
		System.out.println(n-max);
	}
}