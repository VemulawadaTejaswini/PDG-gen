import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();


		if(a<=b && b<=c) {
				System.out.println(c*10+a+b);
			}else {
				if(a<=c && c<=b) {
					System.out.println(b*10+a+c);
				}else {
					System.out.println(a*10+b+c);
				}
			}




		sc.close();
	}

}
