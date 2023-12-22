import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i=a;;i++){
			String s = String.valueOf(i);
			char c1 = s.charAt(0);
			char c2 = s.charAt(1);
			char c3 = s.charAt(2);
			
			if ((c1 == c2) && (c1 == c3)){
				System.out.println(i);
				break;
			}
		}
		
		
		
	}

}
