import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(), r=sc.nextInt();
		if(r-l>=2018) System.out.println(0);
		else {
			int min = l%2019, max = r%2019;
			if(min>=max) System.out.println(0);
			else System.out.println(min*min+min);
		}
	}
}