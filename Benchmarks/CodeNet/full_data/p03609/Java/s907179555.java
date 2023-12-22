import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String result = "";
		for(int i = 0; str.length() > i; i = i + 2){
			result = result + str.charAt(i);
		}
		System.out.println(result);
		scan.close();
	}
}