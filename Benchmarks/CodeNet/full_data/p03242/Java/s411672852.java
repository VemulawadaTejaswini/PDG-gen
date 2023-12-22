import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = String.valueOf(a);
		
		for (int i=0; i<s.length(); i++){
			
			char c = s.charAt(i);
			if (c == '1'){
				System.out.print("9");
			}
			else {
				System.out.print("1");
				
			}
			
		}
		
		System.out.println("");
		
		
		
	}

}
