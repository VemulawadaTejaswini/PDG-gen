import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		
		for (int i = N.length() - 1; i > 0; i--) {
			if (i % 2 == 1) {
				continue;
			}
			
			String sub = N.substring(0, i);
			if (sub.substring(0, i / 2).equals(sub.substring(i / 2, i))) {
				System.out.println(i);
				return;
			}
		}
	}
}