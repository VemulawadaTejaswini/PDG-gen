import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int train , taxi;
		if((train = sc.nextInt() * sc.nextInt()) < (taxi = sc.nextInt())) {
			System.out.println(train);
		} else {
			System.out.println(taxi);
		}
		sc.close();
	}

}
