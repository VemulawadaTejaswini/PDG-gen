import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	

	private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt(),R=sc.nextInt();
		List lst=new ArrayList();
		int min=(L*R)%2019;
		for(int i=L;i<=R;i++) {
			lst.add(i%2019);
		}
		Collections.sort(lst);
		int a=(int)lst.get(0);
		int b=(int)lst.get(1);
		System.out.println(a*b);
		
		
		
		
		
		
		
		
		
	
		
		
}
}

