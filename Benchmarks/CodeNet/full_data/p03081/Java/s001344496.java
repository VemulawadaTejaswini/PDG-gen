import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int masuCount = sc.nextInt();
		int jumonCount = sc.nextInt();
		String str = sc.next();
		int[] masu = new int[masuCount];
		// initialize masu
		for(int i = 0; i < masuCount; i++) {
			masu[i] = 1;
		}

		for(int i=0; i < jumonCount; i++) {
			char input = sc.next().charAt(0);
			// これ1文字目？
			String move = sc.next();
			if(move.equals("L")) {
				for(int j =0; j<masuCount; j++) {
					int masuVal = masu[j];
					if(str.charAt(j) == input) {
						masu[j] = 0;
						if(j !=0) {
							masu[j-1] = masu[j-1] + masuVal;
						}
					}
				}
			}
			if(move.equals("R")) {
				for(int j =0; j<masuCount; j++) {
					int masuVal = masu[j];
					if(str.charAt(j) == input) {
						masu[j] = 0;
						if(j != masuCount -1 ) {
							masu[j+1] = masu[j+1] + masuVal;
						}
					}
				}
			}
		}
		int golems = 0;
		for(int i = 0; i < masuCount; i++) {
			golems += masu[i];
		}
		System.out.println(golems);
		sc.close();
	}
}