import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
String s=sc.nextLine();
char c[]=s.toCharArray();
System.out.print(c[0]);
System.out.print(s.length()-2);
System.out.println(c[s.length()-1]);
	}
}