import java.util.*;
public class Main {
	static long lcm(long a, long b){
		long c=0, r=0;
		c = a * b;
    	r = a % b;
   		while(r!=0){
        	a = b;
        	b = r;
        	r = a % b;
    	}
		return c/b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long lcmvalue = 1;
		int sum = 0;
		int[] a = new int[N];
		for(int i=0;i<N;i++)a[i] = sc.nextInt();
		lcmvalue = lcm(a[0], a[1]);
		for(int i=2;i<N;i++){
			lcmvalue = lcm(lcmvalue,a[i]);
		}
		lcmvalue -= 1;
		for(int i=0;i<N;i++){
			sum += lcmvalue%a[i];
		}
		System.out.println(sum);
	}
}