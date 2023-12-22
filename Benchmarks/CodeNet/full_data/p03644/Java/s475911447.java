import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		int i = 1;
		while(true) {
			if(i>N) {
				break;
			}
			i *= 2;
		}
		if(i ==1) {
			System.out.println("1");
		}
		else System.out.println(i/2);
	}
}