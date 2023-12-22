import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		String first=new String(args[0]);
		String s=stdin.next();
		StringBuilder sb=new StringBuilder();
		sb.append(first);
		sb.delete(0, 4);
		sb.insert(0, s);
		System.out.println(sb);

	}

}