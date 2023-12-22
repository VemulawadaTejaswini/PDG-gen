import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			int[]a = new int[M];
			int []otoshi = new int[N];
			ArrayList<Integer> sa = new ArrayList<Integer>();
			ArrayList<Integer> sb = new ArrayList<Integer>();
			int count = 0;
			int ok = 1;
			
			for(int i =0;i<M;i++) {
				a[i] = scan.nextInt();
				otoshi[a[i]-1]=1;
			}
			
			for(int i = 0;i<N;i++) {
				if(otoshi[i]==1){//その段数が壊れていたなら
					sa.add(count);
					count=0;
					if((i+1)<N) {
						if(otoshi[i+1]==1) {
							//移動方法ない０を出力
							ok=0;
							break;
						}
					}
				}else{//壊れていないなら
					count++;
				}
				
				if(i==N-1) {
					sa.add(count-1);
				}
				
			}
			
			
			
			// 配列の準備
	        int c[][] = new int [N+10][N+10];//n=N段作りきれるように、少し余裕を持って作成します。

	        //パスカルの三角形作成
	        int mod = 1000000007;// オーバーフロー対策：問題で指定されます。
	        c[0][0]=1;// 初期値として、最上部の1を与えます。
	        for(int i=0;i<N+5;i++) {//2000段作りきるようにループを回します。細かい事を考えないで済むように少し余裕を持たせて回しています。
	            for(int j=0;j<N+5;j++) {
	                long tmp =  c[i][j]%mod;// オーバーフロー対策
	                c[i+1][j]+=tmp;
	                c[i+1][j+1]+=tmp;
	            }
	        }
	        
	        for(int i =0;i<sa.size();i++) {
	        	int n = sa.get(i);
	        	int goukei=0;
	        	
	        	for(int j =n/2;j>=0;j--) {
	        		int f=0;
	        		if(j==0) {
	        			goukei+=1;
	        		}else {
	        			goukei=(goukei+c[n/2+n%2+f][j])%mod;
	        			f =f+2;
	        		}
	        	}
	        	
	        	sb.add(goukei);
	        	
	        }
	        
	        
			
			
			
			
			
			
			if(ok==1) {
			
				//System.out.println(c[6][2]);
				long hgoukei=1;
				
				
			
			for(int i =0;i<sb.size();i++) {
				hgoukei =(hgoukei*sb.get(i))%mod;
				
				//System.out.println(sa.get(i));
				//System.out.println(sb.get(i));
				System.out.println(hgoukei);
			}
			}else {
				
				
				
				System.out.println(0);
			}
			
			
			
			
			
			
			
			
			
			
		
		}
		
		
	}
	
	
	
	
	private static long combinations(long n,long k){//(0<k&&k<n) 
		
		if(k==n){return 1;
		}else if(k==1) {return n;
		}else if(0<k&&k<n) {return combinations(n-1, k-1)+combinations(n-1, k);
		}else {return -1;//それ以外はダメ0<k&&k<nの条件外で入力したらｘ
		}
		
	}
		

}
