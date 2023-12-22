import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String weather[] = {"Sunny", "Cloudy", "Rainy"};
		for (int i=0;i<3;i++) {
			if (s.equals(weather[i])==true) {
				System.out.println(weather[(i+1)%3]);
				return ;
			}
		}
	}

}
