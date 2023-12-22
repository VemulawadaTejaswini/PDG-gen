import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 1;
		int sub = n - k;
		if (sub % (k - 1) == 0) {
			count += sub / (k - 1);
		} else {
			count += sub / (k - 1) + 1;
		}
		System.out.println(count);
	}
}
