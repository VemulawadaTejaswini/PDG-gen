import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = Long.parseLong(sc.next());
		
		long sum = 0;
		
		for(int i = 1; i < n+1; ++i) {
		    if((i % 3 != 0) && (i % 5 != 0)) {
		        sum += i;
		    }
		}
		
		System.out.println(sum);
		
	}
}