import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int y = sc.nextInt();
		
		int temp = 0;
		int a= 0 , b= 0 , c= 0;
		otosi :for( a = 0; a <= n ; a++) {
			for(b = 0 ; b <= n-a ; b++) {
				 c = n - a - b;
				int sum = 10000*a + 5000*b + 1000*c;
				if(sum == y) {
					temp = 1;
					break otosi;
				}
			}
		}
		if(temp == 1) {
		System.out.println(a+" "+b+" "+c);
		}
		if(temp == 0) {
	    System.out.println(-1+" "+-1+" "+-1);
		}

	}

}
