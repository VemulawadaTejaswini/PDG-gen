import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A,B,C;
		Scanner sc=new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		if(C<=B&&C>=A) {
			System.out.println("Yes");
		}else if(C>=B&&C<=A) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
