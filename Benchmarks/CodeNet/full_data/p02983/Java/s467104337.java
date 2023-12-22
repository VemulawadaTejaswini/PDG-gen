import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong(), r=sc.nextLong();
		if(r-l>=2018) System.out.println("0");
		else {
			long min = l%2019, max = r%2019;
			if(min>max) System.out.println("0");
			else System.out.println(min*min+min);
		}

	}
}