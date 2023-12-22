import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {		
		
		ArrayList<Long> ks = new ArrayList<>();
		
		double min = Long.MAX_VALUE;
		long dif = 10000000;
		for(long x = 999999999999999L; x >= 1; x -= dif){
			double c = f(x);
			if(c <= min){
				ks.add(x);
				min = c;
			}
			int s = (int)Math.log10(x);
			dif = (long)Math.pow(10, 2*s/3);
		}
		Collections.reverse(ks);
		Scanner seer = new Scanner(System.in);
		int n = seer.nextInt();
		for(int i = 0; i < n; i++){
			System.out.println(ks.get(i));
		}
	}
	static double f(long x){
		long aux = x; int sum = 0;
		while(aux > 0){
			sum += aux%10;
			aux/=10;
		}
		return x*1.0 / sum;
	}
}
