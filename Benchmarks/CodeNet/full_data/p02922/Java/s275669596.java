import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();	
		int sockets = 1;
		int count = 0;
		while(sockets<b) {
			sockets--;
			sockets+=a;
			count++;
		}
		System.out.println(count);

	}

}
