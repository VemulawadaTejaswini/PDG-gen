import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		if((A==B&&B==C&&C==A) ||
				A!=B&&B!=C&&C!=A){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}

	}

}