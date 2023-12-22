import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			if(a%i == 0 && a/i < 10) {
				System.out.println("Yes");
				break;
			} else if (i == 9){
				System.out.println("No");
			}
		}
		
		
	
	}

}
