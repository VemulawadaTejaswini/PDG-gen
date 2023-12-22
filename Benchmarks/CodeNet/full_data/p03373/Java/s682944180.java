import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		

		int sum=0;
		
		//cのピザ2枚でa1枚、b1枚分。
		if(a+b>2*c) {
			
			//xとyのうち少ないほうに合わせてｃを買い、残りは直接かう？
			//単品よりc*2のほうが安いパターンもくるかもしれない。
			
			sum+=Math.min(x,y)*2*c;
			
			if(x>y) {
				
				int rate=Math.min(a,2*c);
				
				sum+=(x-y)*rate;
			}else if(x<y) {
				int rate=Math.min(b,2*c);
				
				sum+=(y-x)*rate;
				
			}
			
			
			
		}else {
			sum+=a*x+b*y;
		}

		System.out.println(sum);
		
		scanner.close();

	}
}