import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		
		if (input1 == input2){
			System.out.println("Draw");
		}else if(input1 == 1 && input2 != 1){
			System.out.println("Alice");
		}else if(input2 == 1 && input1 != 1){
			System.out.println("Bob");
		}else if(input1 > input2){
			System.out.println("Alice");
		}else if(input1 < input2){
			System.out.println("Alice");
		}
		scanner.close();
	}
}
