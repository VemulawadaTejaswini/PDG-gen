import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if(a == b){
			System.out.println("Draw");
		}else{
			if(a==1){
				System.out.println("Alice");
				return;
			}
			if(b==1){
				System.out.println("Bob");
				return;
			}
			if(a>b){
				System.out.println("Alice");
			}else{
				System.out.println("Bob");
			}
		}
	}
}