import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		while(n>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			num +=(b-a+1);
		}
			n--;
			System.out.println(num);
	}

}
