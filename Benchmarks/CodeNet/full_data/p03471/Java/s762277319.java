import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int y=sc.nextInt();
		if(y<n*1000||n*10000<y) {
			System.out.println(-1+" "+-1+" "+-1);
			return;
		}else{
			for(int man=0;man*10000<=y;man++) {
				for(int sen=0;sen<=n-man;sen++) {
					int gosen=n-man-sen;
					if(sen*1000+gosen*5000+man*10000==y) {
						System.out.println(sen+" "+gosen+" "+man);
						return;
					}
				}
			}
			System.out.println(-1+" "+-1+" "+-1);
		}

	}
}