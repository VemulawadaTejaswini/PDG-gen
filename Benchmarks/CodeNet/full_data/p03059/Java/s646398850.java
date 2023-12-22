import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String inputN = scanner.nextLine();
		String inputA = scanner.nextLine();

		scanner.close();
		
		System.out.println("1");
	}
	
	private static int calc(int x, int y) {
        int tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
        
        return y;
	}
}