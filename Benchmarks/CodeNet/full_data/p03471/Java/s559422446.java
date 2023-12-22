import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int y = sc.nextInt();
			int man = 10000;
			int go = 5000;
			int sen = 1000;
			
			
			String no = "-1 -1 -1";
			
			if(y>man*n) {
				System.out.println(no);
				return;
			}
			
			for(int i=0;i<=y/man;i++) {
				int x = ((y-man*i)/sen+i-n);
				if(x%4==0&&(n-x/4-i>=0)&&x/4>=0) {
					System.out.println(i+" "+x/4+" "+(n-i-x/4));
					return;
					
				}
			}
			
			System.out.println(no);
		}

	}
