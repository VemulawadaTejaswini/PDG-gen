import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		long count = 1;
		int a = x.indexOf("A");
		int b = x.lastIndexOf("Z");
		System.out.println(b-a+1);
	}
}