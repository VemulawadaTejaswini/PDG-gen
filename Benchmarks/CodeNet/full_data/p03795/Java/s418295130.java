
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int times = num / 15;
		System.out.println(num * 800 - times * 200);
	}
}