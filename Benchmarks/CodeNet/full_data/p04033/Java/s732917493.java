import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(),b = scanner.nextInt();
		boolean check;
		int count = 0;
		for(int i=a;i<b;i++){
			if(i == 0){
				System.out.println("Zero");
				return ;
			}
			if(i < 0){
				count++;
			}
		}
		if(count % 2 == 0){
			System.out.println("Positive");
		}else{
			System.out.println("Negative");
		}
	}

}
