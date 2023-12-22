import java.util.Scanner;

public class Main {
  
  	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int f[] = new int[N];
		int h[] = new int[N];

		for(int i=0;i<N;i++){
			f[i] = Integer.MAX_VALUE;
		}
		
		h[0] = sc.nextInt();
		f[0] = 0;
		

		for(int i=2;i<=N;i++){
			h[i-1] = sc.nextInt();
			
			for(int j=1;j<=K;j++){
				
				if(j > i-1){
					break;
				}
				int f_ik =Math.abs(h[i-1]-h[i-1-j]) + f[i-1-j];
				f[i-1] = Math.min(f[i-1],f_ik);
			}
			

			//f[i-1] = flog2(i-1,K,h,f);
		}

		System.out.println(f[N-1]);
	}
}