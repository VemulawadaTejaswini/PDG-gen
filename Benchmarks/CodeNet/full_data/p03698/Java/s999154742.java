import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		boolean flag = true;
		for(int i = 0; i < string.length(); i++){
			char x = string.charAt(i);
			if(string.indexOf(x,i+1) != -1){
				System.out.println("no");
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("yes");
		}
	}
}
