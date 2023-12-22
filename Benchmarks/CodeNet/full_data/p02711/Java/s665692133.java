import java.util.Scanner;

public class  Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int str = scanner.nextInt();
		if(str % 10 == 7){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

	}

}
