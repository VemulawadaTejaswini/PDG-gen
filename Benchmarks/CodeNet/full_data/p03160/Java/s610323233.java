import java.util.Scanner;

public class Main {
  
  	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int f[] = new int[N];
		int h[] = new int[N];
		
		h[0] = sc.nextInt();
		h[1] = sc.nextInt();
		
		f[1-1] = 0;
		f[2-1] = Math.abs(h[2-1] - h[1-1]);
		
		for(int i=3;i<=N;i++){
			
			f[i-1] = -1;
			h[i-1] = sc.nextInt();
			
			f[i-1] = flog1(i-1,h,f);
		}
		
		System.out.println(f[N-1]);
	}
	
	public static int flog1(int i,int[] h,int[] f){
		
		if(i == 0){
			return f[0];
		}
		else if(i == 1){
			return f[1];
		}
		
		if(f[i] != -1){
			return f[1];
		}
		else{
			int f_i1 = Math.abs(h[i]-h[i-1]) + f[i-1];
			int f_i2 = Math.abs(h[i]-h[i-2]) + f[i-2];
			
			return Math.min(f_i1, f_i2);
		}
	}
}