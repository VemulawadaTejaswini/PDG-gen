import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		int A = 0;
		int B = 0;
		
	
		int x = H / 3;
		
		int S1=x*W;
		int S2= 0;
		int S3= 0;
				
		if(W%2==0){
			S2=(W/2)*(H-x);
			S3=(W/2)*(H-x);
		}else{
			int h = W/2;
			S2=h*(H-x);
			S3=(h+1)*(H-x);
		}
		
		int a = Math.max(Math.max(S1, S2),S3) - Math.min(Math.min(S1, S2),S3);

		
		int y = (H / 3)+1;
		S1=y*W;
		S2= 0;
		S3= 0;
				
		if(W%2==0){
			S2=(W/2)*(H-y);
			S3=(W/2)*(H-y);
		}else{
			int h = W/2;
			S2=h*(H-y);
			S3=(h+1)*(H-y);
		}
		
		int b = Math.max(Math.max(S1, S2),S3) - Math.min(Math.min(S1, S2),S3);
		
		A = Math.min(a, b);
		
		
		x = W / 3;
		
		S1=x*H;
		S2= 0;
		S3= 0;
				
		if(H%2==0){
			S2=(H/2)*(W-x);
			S3=(H/2)*(W-x);			
		}else{
			int h = H/2;
			S2=h*(W-x);
			S3=(h+1)*(W-x);
		}
		
		a = Math.max(Math.max(S1, S2),S3) - Math.min(Math.min(S1, S2),S3);

		
		y = (W / 3)+1;
		S1=y*H;
		S2= 0;
		S3= 0;
				
		if(H%2==0){
			S2=(H/2)*(W-y);
			S3=(H/2)*(W-y);
		}else{
			int h = H/2;
			S2=h*(W-y);
			S3=(h+1)*(W-y);
		}
		
		b = Math.max(Math.max(S1, S2),S3) - Math.min(Math.min(S1, S2),S3);
		
		B = Math.min(a, b);	
		
		int N = Math.min(Math.min(H, W),Math.min(A, B));		
		
		if(H % 3 == 0| W % 3 == 0){
			N = 0;
		}
		
		System.out.println(N);

		
	}

}