import java.util.*;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int total = 0;
		if (n>k) {
			total = x*k;
			total+= (n-k)*y;}
		else {
			total = n*x;
		}
		
		System.out.println(total);
            }
		}
	

