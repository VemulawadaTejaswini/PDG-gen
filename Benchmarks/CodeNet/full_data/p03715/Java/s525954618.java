import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long w = sc.nextInt();
		long h = sc.nextInt();
		
		if(w%3==0 || h%3==0)
			System.out.println(0);
		else
			System.out.println(Math.min(solve(w, h), solve(h, w)));

	}
	static long solve(long w, long h){
		long min = Long.MAX_VALUE;
		for(int i=1;i<h;i++){
			long a = w*i;
			long b = 0, c = 0;
			if(w%2==0){
				b = w/2*(h-i);
				c = b;
				min = Math.min(min, Math.max(a, Math.max(b, c))-Math.min(a, Math.min(b, c)));
			}
			else if((h-i)%2==0){
				b = w*((h-i)/2);
				c = b;
				min = Math.min(min, Math.max(a, Math.max(b, c))-Math.min(a, Math.min(b, c)));
			}
			else{
				b = w*((h-i)/2);
				c = w*((h-i)/2+1);
				min = Math.min(min, Math.max(a, Math.max(b, c))-Math.min(a, Math.min(b, c)));
				
				b = w/2*(h-i);
				c = (w/2+1)*(h-i);
				min = Math.min(min, Math.max(a, Math.max(b, c))-Math.min(a, Math.min(b, c)));

			}
		}
		return min;
	}
}
