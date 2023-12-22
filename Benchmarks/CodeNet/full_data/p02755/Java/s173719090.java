import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			double adashi = A*100/8;//それぞれ税抜き価格を求める小数点は切り捨て
			int a = (int)adashi;//A奇数の時点で終了
			int b = (int)B*100/10;
			int answer;
			
			
		
			if(A%2==1) {//Aが奇数ならやる必要がない
				System.out.println(-1);
			}else {
				
				if(a==b) {//もしa=bならとりあえず仮の答えが見つか
					answer =a;
					int X = a;
					while(X>0) {
						X--;
						int c = (int)X*8/100;
						int d = (int)X*10/100;
						if(c==A&&d==B) {
							answer = X;
							}
						
						
						}
					
					System.out.println(answer);
				
				}else{
					if(a>b) {
						if((int)(a*10/100)==B) {
							answer = a;
							System.out.println(answer);
						}else {
							System.out.println(-1);
						}
						
					}
					if(a<b) {
						if((int)(b*8/100)==A) {
							answer = b;
							System.out.println(answer);
						}else {
							System.out.println(-1);
						}
						
					}
					
				
			}
			
			}
		
		
		}	
	}
}
