import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str = reader.next();
		String ans = "2018" + str.substring(4);

		System.out.println(ans);
		reader.close();
	}


}



