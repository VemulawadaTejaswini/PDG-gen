import java.util.Scanner;
//086C
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n =sc.nextInt();
		int preT =0;
		int preX =0;
		int preY =0;
		boolean isReachable =true;
		
		for (int i=0;i<n;i++) {
			int postT =sc.nextInt();
			int postX =sc.nextInt();
			int postY =sc.nextInt();
			
			int manDis =postT-preT;
			int x =Math.abs(postX-preX);
			int y =Math.abs(postY-preY);
			
			if (x+y>manDis||(manDis-(x+y))%2!=0) {
				isReachable =false;
				break;
			}
			preT =postT;
			preX =postX;
			preY =postY;
		}
		
		if (isReachable) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
}