import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i*j==a) {
					System.out.println("Yes");

					
					break;
				}
				if(i==9&&j==9&&i*j!=a) {
					System.out.println("No");


				}
			}

		}

 
		sc.close();
	}
}