import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		//int A = scanner.nextInt();
		//int B = scanner.nextInt();
		String S = scanner.nextLine();
		if(S.matches("^[0-9]{1,5}-[0-9]{1,5}$")){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		System.out.println();
		scanner.close();
	}
}
