import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] value = new char[3];

		value = sc.next().toCharArray();
		if(value[0] != value[1] || value[1] != value[2])
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
