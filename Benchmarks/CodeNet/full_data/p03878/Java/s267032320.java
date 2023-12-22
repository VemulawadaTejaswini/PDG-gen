import java.util.Arrays;
import java.util.Scanner;

class event implements Comparable<event>{
		public int a;
		public int b;
		public event(int a , int b){
			this.a = a;
			this.b = b;
		}
		
		public int compareTo(event other){
			// return b - other.b;
			return Integer.compare(b , other.b);
		}
		
}

public class A_1D_Matching {


	
	public static void main(String[] args) {
		
		long mod = 10^9+7;
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int size[] = new int[2];
		event[] a = new event[2*n];
		
	    for (int x=0; x<2; x++)
	    	for (int i=0; i< n; i++)
	    		a[i+x*n] = new event(x, in.nextInt());

		Arrays.sort(a);

		long res = 1;
		for(event e : a){
			if(size[1 - e.a] > 0){
				res *= size[1 - e.a];
				//res %= mod;
				size[1 - e.a]--;
			}else{
				size[e.a]++;
			}
			
		}
		
		System.out.println(res);
		
		
	}

}
