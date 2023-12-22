import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int str1 = sc.nextInt();
		int str2 = sc.nextInt();
		String str3 = sc.nextLine();
		String[] result = str3.split("[\\s]+");

		String[] yoko = new String[str2 + 2];
		for(int i=0; i<yoko.length; i++){
			System.out.print("#");
		}
		System.out.println();
		
		for(int j=1; j<result.length; j++){
			System.out.print("#");
			System.out.print(result[j]);
			System.out.print("#");
			System.out.println();
		}

		for(int i=0; i<yoko.length; i++){
			System.out.print("#");
		}
	}
}