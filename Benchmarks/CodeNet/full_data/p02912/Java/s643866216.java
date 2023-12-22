import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,r,x,y,z;
	long ans;
	int[] Ai;
	int[] rank = new int[31];
	String[] S;

	Main(){
		// 整数の入力
		n = sc.nextInt();
		m = sc.nextInt();

		Ai = new int[n];

		for(int i=0;i<n;i++){
			Ai[i] = sc.nextInt();
		}

		Arrays.sort(Ai);
		int val = 0;

		for(int i=0;i<n;i++){
			while(Math.pow(2,val)<Ai[i]){
				val++;
			}
			rank[val]++;
		}

		while(m>0){
			int Aidx = n-1;
			for(int t=rank[val];t>0;t--){
				Ai[Aidx] /= 2;
				m--;	Aidx--;
				if(m<=0||Aidx<0)break; 
			}
			if(val>0)rank[val-1] += rank[val];
			else break;
			val--;
			Arrays.sort(Ai);
		}

		for(long l:Ai){
			ans += l;
		}

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}