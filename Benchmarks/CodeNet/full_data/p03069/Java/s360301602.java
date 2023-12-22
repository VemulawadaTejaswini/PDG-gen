import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		String s = scanner.next();

		String searchString = ".#";

		if(s.indexOf(".") ==-1 || s.indexOf("#") == -1) {
			System.out.println("0");
			scanner.close();
		} else {
			System.out.println(reccount(s,0));

			scanner.close();
		}


	}

	private static int reccount(String s,int i) {
		if(s.indexOf("#.") == -1) {
			return i;
		}
		String temp = s.substring(s.indexOf("#.")+1);
		i++;

		return reccount(temp, i);
	}

}
