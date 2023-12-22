import java.util.Scanner;

public class Main {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		long[] trans = new long[5];

		
		long n = Long.parseLong(sc.next());
		
		for(int i=0;i<trans.length;i++) {
			trans[i] = Long.parseLong(sc.next()); 
		}
		
		long min=Long.MAX_VALUE;
		for(int i=0 ;i<trans.length;i++) {
			if(trans[i]<min) {
				min = trans[i];
			}
		}
		
		long power = n/min;
		if(n%min!=0)power++;
						
		System.out.println(power+4l);
	}
}
