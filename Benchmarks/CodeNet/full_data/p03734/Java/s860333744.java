import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int W = sc.nextInt();
		int w[] = new int[n+1];
		int v[] = new int[n+1];
		
		List<Integer> li[] = new ArrayList[4];
		for(int i=0;i<4;i++)
			li[i] = new ArrayList<>();
		
		for(int i=1;i<=n;i++){
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
			li[w[i] - w[1]].add(v[i]);
		}
		
		for(int i=0;i<4;i++)
			Collections.sort(li[i]);
		
		int vsum[][] = new int[4][n+1];
		for(int i=0;i<4;i++){
			for(int j=0;j<li[i].size();j++){
				vsum[i][j+1] = vsum[i][j] + li[i].get(li[i].size()-1-j);
			}
		}
		
		int ans = 0;
		int A = li[0].size();
		int B = li[1].size();
		int C = li[2].size();
		int D = li[3].size();
		
		for(int a=0;a<=A;a++){
		for(int b=0;b<=B;b++){
		for(int c=0;c<=C;c++){
		for(int d=0;d<=D;d++){
			if((long)w[1] * (a+b+c+d) + b +2*c + 3*d <= W){
				int sum = vsum[0][a] + vsum[1][b] + vsum[2][c] + vsum[3][d];
				ans = Math.max(ans, sum);
			}
		}}}}
		
		System.out.println(ans);
		
	}

}
