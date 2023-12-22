import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d,m = 0;
		for(int i = 0;i < n;i ++) {
			d = in.nextInt();
		    while(d % 2 == 0) {
		    	d /= 2;
		    	m ++;
		    }
		}
		System.out.println(m);
	}
}
