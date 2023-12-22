import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int number = sc.nextInt();
		ArrayList<Integer> divisors,semiDivisors;
		divisors = new ArrayList<Integer>();
		semiDivisors = new ArrayList<Integer>();
		int x = sc.nextInt();
		int y = sc.nextInt();
		for(int j=1;j<=x || j<=y;j++) {
			if(x%j + y%j==0)
				divisors.add(new Integer(j));
			else if(x%j==0 || y%j==0)
				semiDivisors.add(new Integer(j));
		}
		for(int i=2;i<number;i++) {
			x = sc.nextInt();
			Iterator<Integer> it = semiDivisors.iterator();
	        while(it.hasNext()){
	            Integer next = it.next();
	            if(x % next.intValue() != 0) it.remove();
	        }
	        
	        it = divisors.iterator();
	        while(it.hasNext()){
	            Integer next = it.next();
	            if(x % next.intValue() != 0) {
	            	it.remove();
	            	semiDivisors.add(next);
	            }
	        }
		}
		sc.close();
		//System.out.println(semiDivisors.size());
		int max = 1;
		for(Integer num : divisors)
			if(num.intValue() > max)
				max = num.intValue();
		
		for(Integer num : semiDivisors)
			if(num.intValue() > max)
				max = num.intValue();

		System.out.println(max);
	}
}