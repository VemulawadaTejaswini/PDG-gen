import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (C>=A && C<=B){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();
	}

}
