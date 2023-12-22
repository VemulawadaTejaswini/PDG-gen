import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int count = 0;
		
		int see = 2*d+1;
		
		while(true) {
			if(n > 0) {
				n -= see;
				count++;
			}else {
				break;
			}
		}
		
		System.out.println(count);
	}

}
