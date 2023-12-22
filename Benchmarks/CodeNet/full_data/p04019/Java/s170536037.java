import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		
		if((str.contains("N") == str.contains("S")) && (str.contains("W") == str.contains("E"))){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
