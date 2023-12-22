import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		//int B = scanner.nextInt();
		//String S = scanner.nextLine();
		if(N % 3 == 0){
			System.out.println(N/3);
		}else if(N % 3 == 1){
			System.out.println((N-1)/3);
		}else if(N % 3 == 2){
			System.out.println((N-2)/3);
		}
		scanner.close();
	}
}
