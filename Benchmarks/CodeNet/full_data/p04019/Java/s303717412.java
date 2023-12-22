import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s=scanner.next();
		if(s.contains("N")&&s.contains("W")&&s.contains("S")&&s.contains("E")){
			System.out.println("Yes");
		}else if(s.contains("N")&&!s.contains("W")&&s.contains("S")&&!s.contains("E")){
			
			System.out.println("Yes");
		}else if(!s.contains("N")&&s.contains("W")&&!s.contains("S")&&s.contains("E")){
			
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
