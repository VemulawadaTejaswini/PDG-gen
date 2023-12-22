import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String ans = sc.next().replace('1', '0').replace('9', '1').replace('0', '9');	 
	        System.out.println(ans);
	}
}