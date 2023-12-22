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

		for(int i=2;i<1000000;i++) {
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
