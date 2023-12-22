import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.next());
		int count = 0;
		for(int i=1; i<=k; i+=2) {
		    for(int j=2; j<=k; j+=2) {
		        count++;
		    }
		}
		System.out.println(count);
	}
}