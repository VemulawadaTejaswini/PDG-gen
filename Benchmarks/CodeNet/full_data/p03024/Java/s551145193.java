import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String remove = s.replaceAll("o", "");
		if(remove.length() < 8) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		sc.close();	
	}

}
