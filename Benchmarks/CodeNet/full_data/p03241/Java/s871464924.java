import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < n) {
			int a = m;
			m = n;
			n = a;
		}
		
		int i = n;
		
		for( ; i > 0 ; i--){
			
			if(m % i == 0){
				break;
			}
			
		}
		
		System.out.println(i);
	}
}
