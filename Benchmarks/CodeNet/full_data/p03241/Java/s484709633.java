import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i = n; i >=1 ; i--) {
			if(m%i == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}