import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		

		int c1 = Math.abs(n2-n1);
		int c2 = Math.abs(n3-n1);
		int c3 = Math.abs(n3-n2);

		int c = 0;
		if ( c1 > c2 ) {
			if ( c1 > c3 ){
				c = c2 + c3;
			}else{
				c = c1 + c3;
			}
		}else{
			if ( c2 > c3 ){
				c = c1 + c3;
			}else{
				c = c1 + c2;
			}
		}
		System.out.println(c);
	}

}