import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int H,W;
	void solve(){
		Scanner sc=new Scanner(System.in);
		H=sc.nextInt();
		W=sc.nextInt();
		
		if(H%3==0 ||  W%3==0)System.out.println(0);
		else{
			long min;
			//1通りめ
			int h1=H/3;
			int h2=H/3;
			int h3=H-h1-h2;
			min=Math.abs(h3*W-h1*W);
			//2通り目
			int w1=W/3;
			int w2=W/3;
			int w3=W-w1-w2;
			min=Math.min(min, Math.abs(w3*H-w1*H));
			//3通り目:横を分割
			int a1=W;
			int b1=H/3;
			int b2=H-b1;
			int a2=W/2;
			int a3=W-a2;
			long S1=a1*b1;
			long S2=a2*b2;
			long S3=a3*b2;
			min=Math.min(min, calc(S1,S2,S3));
			
			//4
			a1=W;
			b1=H/2;
			b2=H-b1;
			a2=W/2;
			a3=W-a2;
			S1=a1*b1;
			S2=a2*b2;
			S3=a3*b2;
			min=Math.min(min, calc(S1,S2,S3));
			
			//5通り目:たてを分割
			int c1=H;
			int d1=W/3;
			int d2=W-d1;
			int c2=H/2;
			int c3=H-c2;
			long T1=c1*d1;
			long T2=c2*d2;
			long T3=c3*d2;
			min=Math.min(min, calc(T1,T2,T3));
			
			//6
			c1=H;
			d1=W/2;
			d2=W-d1;
			c2=H/2;
			c3=H-c2;
			T1=c1*d1;
			T2=c2*d2;
			T3=c3*d2;
			min=Math.min(min, calc(T1,T2,T3));
			
			
			System.out.println(min);
		}
		
	}
	long calc(long a,long b,long c){
		long Max=Math.max(a, b);
		Max=Math.max(Max, c);
		long Min=Math.min(a, b);
		Min=Math.min(Min, c);
		
		return Max-Min;
	}
	
}
