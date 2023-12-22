import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long smile = 0;

		if(x > 500){
			smile += (x / 500) * 1000;
			x = x % 500;
		}
		if(x > 5){
			smile += (x / 5) * 5;
		}
		System.out.println(smile);
	}
}