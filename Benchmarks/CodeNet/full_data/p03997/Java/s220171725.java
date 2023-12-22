import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	String line = br.readLine();

		Scanner scan = new Scanner(System.in);
		int str1 = Integer.parseInt(scan.next());
		int str2 = Integer.parseInt(scan.next());
		int str3 = Integer.parseInt(scan.next());


		System.out.println((str1+str2)*str3/2);

	}
}