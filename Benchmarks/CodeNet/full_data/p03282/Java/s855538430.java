import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s =scanner.nextLine();
		long n = scanner.nextLong();
		
		for(int i=0;i<n;i++){
			if(s.charAt(i)=='1'){
				continue;
			}
			else {
				System.out.println(s.charAt(i));
			}
		}
		
		System.out.println(1);
	}
}
