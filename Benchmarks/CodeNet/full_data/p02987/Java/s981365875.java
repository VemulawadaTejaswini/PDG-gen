import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String trimed = input.replace(input.substring(0, 1), "");
		System.out.println(trimed.length());
		if(trimed.length()==2){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}