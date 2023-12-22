import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		String[] tokens = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < tokens.length;++i)
			sb.append(tokens[i].toUpperCase().charAt(0));
		System.out.println(sb.toString());
	}
}
