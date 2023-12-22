import java.util.Scanner;

public class SS{
	
	public static void Main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		for(int i = 1; i < str.length(); i++) {
			if(isEven(str.substring(0, str.length()-i))) {
				System.out.println(str.length() - i);
				break;
			}
		}
	}
	
	static boolean isEven(String str) {
		if(str.length() % 2 == 1) return false;
		else {
			for(int i = 0; i < str.length() / 2; i++) {
				if(str.charAt(i) != str.charAt(str.length() / 2 + i)) return false;
			}
			return true;
		}
	}
}
