import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =  new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] h = new long[n];
		for (int i = 0; i < n; i++) h[i] = sc.nextLong();
		
		int last = 0;
		int max = 0;
		
		for (int i = 0; i < n -1 ; i++) {
			if (h[i] - h[i+1] < 0) {
				//if (i+1 - last > max) max = i+1 - last;
				last = i+1;
			} else {
				if (i+1 - last > max) max = i+1 - last;
			}
			//System.out.println("last:"+ last + " max="+ max);
		}
		
		System.out.println(max);
	}

}
