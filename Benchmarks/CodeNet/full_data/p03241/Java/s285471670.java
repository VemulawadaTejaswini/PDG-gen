import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int a;
		
		for(int i = n; i <=m ; i++) {
			if(m%i == 0) {
				a = m/i;
				System.out.println(a);
				break;
			}
		}
	}
}