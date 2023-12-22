import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

//		System.out.println("a = "+a+", b = "+b);

		int z = a;
		do {
			a++;
			z = z*a;
//			System.out.println("a = "+a);
//			System.out.println("z = "+z);

		}while(a<b);


		if (z == 0){
			System.out.println("Zero");

		}
		else if(z>0){
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}

//		System.out.println(z);




//		System.out.println(z);


	}
}
