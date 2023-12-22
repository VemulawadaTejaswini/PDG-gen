import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();

		HashMap<Integer,Integer> maps = new HashMap<>();
		int rem[][] = new int[D][H*W/D+1];

		for(int d=0;d<D;d++){
			for(int n=0;n<H*W/D+1;n++){
				rem[d][n] = -1;
			}
		}

		for(int h=0;h<H;h++){
			for(int w=0;w<W;w++){
				int val = sc.nextInt();

				rem[val%D][val/D]= h*W + w;

			}
		}

		for(int d=0;d<D;d++){
			for(int n=rem[d].length-1;n>=0;n--){
				if(n==0) rem[d][n] = 0;
				else	rem[d][n] = res(rem[d][n]/W - rem[d][n-1]/W , rem[d][n]%W - rem[d][n-1]%W);
			}
		}


		int Q = sc.nextInt();
		int ans[] = new int[Q];

		for(int q=0;q<Q;q++){
			int L = sc.nextInt();
			int R = sc.nextInt();
			if(L==R){
				ans[q] = 0;
				continue;
			}

			int mp=0;
			int px=-1,py=-1;
			for(int n=1;n<(R-L)/D+1;n++){
				mp += rem[L%D][L/D+n];
				
			}

			ans[q] = mp;

		}

		for(int a : ans){
			System.out.println(a);
		}

	}

	private static int res(int h,int w){
		return Math.abs(h) + Math.abs(w);
	}
}