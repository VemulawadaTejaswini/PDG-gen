import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i = 0;
		int x;
		int y=0;
		int ans =1;
		while(N!=i) {
			i++;
			x=sc.nextInt();
			if(x==0) {
				y++;
			}else {
				ans=ans*x;
			}
		}
		if(y==0) {
			System.out.println(0);
		}else {
			System.out.println(ans);
		}
		
	}

}
