import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int ytotal = scanner.nextInt();
		int xtotal = scanner.nextInt();
		
		if((ytotal*xtotal)%2==1) {
			System.out.println(ytotal*xtotal/2+1);
		}else {
			System.out.println(ytotal*xtotal/2);
		}

	}
			
}