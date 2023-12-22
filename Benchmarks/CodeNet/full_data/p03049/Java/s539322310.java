




import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		boolean allSame = true;
		int startB = 0;
		int endA = 0;

		int count = 0;
		
		for (int i=0;i<n;i++) {
			String str = sc.next();
			if (str.charAt(0)=='B') {
				startB++;
			}
			if (str.charAt(str.length()-1)=='A') {
				endA++;
			}
			if ((str.charAt(0)=='B')^(str.charAt(str.length()-1)=='A')) {
				allSame=false;
			}
			for (int j=0;j<str.length()-1;j++) {
				if (str.charAt(j)=='A' && str.charAt(j+1)=='B') {
					count++;
				}
			}
		}
		if (allSame && startB>0) {
			count--;
		}
		System.out.println(count+Math.min(startB,endA));



	}




}
