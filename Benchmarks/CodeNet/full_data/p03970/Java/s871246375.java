import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = "CODEFESTIVAL2016";
		String s2 = scanner.next();
		int count = 0;
		for(int i = 0; i < s1.length(); ++i){
			if(s1.charAt(i) != s2.charAt(i))
				++count;
		}
		System.out.println(count);
		scanner.close();
	}

}
