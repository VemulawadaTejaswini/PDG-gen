import java.util.Scanner;

/**
 * 
 * @author morisin
 * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int S = sc.nextInt();
		
		int nextNum = S;
		
		if(S==4) {
			System.out.println(4);
			return;
		}
		if(S==2) {
			System.out.println(5);
			return;
		}
		if(S==1) {
			System.out.println(4);
			return;
		}

		for(int i=2;i<=1000000;i++) {
			if(nextNum%2 == 0) {
				nextNum = nextNum/2;
			}else {
				nextNum = nextNum*3+1;
			}
			if(nextNum == 4) {
				System.out.println(i+3);
				break;
			}
		}
	}
}
