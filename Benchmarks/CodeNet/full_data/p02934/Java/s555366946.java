import java.util.*;

public class Main {
	static int N=26;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int data[] =new int[N];
		double t=0;
	
		for(int i=0;i<data.length;i++) {
			data[i]=sc.nextInt();
			
			t += (double)1.0/data[i];
		}
		double ans =( double)1.0/t;
	System.out.println(ans);

		

	}

}