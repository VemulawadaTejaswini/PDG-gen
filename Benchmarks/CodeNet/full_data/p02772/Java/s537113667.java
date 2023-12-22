import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean ch = true;
		for(; N > 0; N--) {
			int a = sc.nextInt();
			if(a%2 == 0) {
				if((a%3 != 0)&&(a%5 != 0)) {
					ch = false;
					break;
				}
			}
		}
		if(ch)System.out.println("APPROVED");
		else System.out.println("DENIED");
	}
}