import java.util.*;

public class Main {

	static void log(long i) {
		System.out.println(i);
	}
	static void log(String s) {
		System.out.println(s);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		

		long total=0;
		
		for(int i=0; i<=n; i++) {
			if(i%15==0)
				continue;
			if(i%3==0)
				continue;
			if(i%5==0)
				continue;
			total+=i;
		}
		
		sc.close();
		log( total );
	}
}
