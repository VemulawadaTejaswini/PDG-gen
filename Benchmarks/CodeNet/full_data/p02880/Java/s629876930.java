
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n= sc.nextInt();
		boolean isTimeTable =false;
		for (int i=1;i<=9;i++) {
			for (int j=1;j<=9;j++) {
				if (i*j==n) {
					isTimeTable =true;
				}
			}
		}
		if (isTimeTable) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
	//----------------------------------------
	//置き場
	
	//----------------------------------------
}