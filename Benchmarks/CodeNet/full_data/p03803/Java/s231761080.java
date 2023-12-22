import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int AliceFlag = 0;
		if(A == B) {
			
		} else if(A == 1) {
			AliceFlag = 1;
		} else if(B == 1) {
			AliceFlag = -1;
		} else if(A > B) {
			AliceFlag = 1;
		} else {
			AliceFlag = -1;
		}
		switch(AliceFlag) {
		case -1:
			System.out.println("Bob");
			break;
		case 0:
			System.out.println("Draw");
			break;
		case 1:
			System.out.println("Alice");
			break;
		}
	}
}
