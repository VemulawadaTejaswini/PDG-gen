
import java.util.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

	    List<Double> n1 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            double d = (double)sc.nextInt();
			n1.add(d);
		}
		
		double ans = 0;
		
		Collections.sort(n1,Collections.reverseOrder());
		
		for (int i = 0; i < N-1; i++) {
            double d = n1.get(i);
			
			for ( int j = 0 ; j < i + 1 ; j++)
			{
			d = d / 2;
			}
			ans +=d ;
          
		}
		
		double d2 = n1.get(N-1);
		
		for ( int j = 0 ; j < N-1 ; j++)
			{
			d2 = d2 / 2;
			}
			ans += d2;
			
			System.out.println(ans);
	}
}
		
		