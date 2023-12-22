import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solver{
	Scanner sc =new Scanner(System.in);
	
	void run(){
		
		int n = sc.nextInt();
		long sum[] = new long[n+1];
		
		for(int i = 0; i < n ; i++){
			sum[i+1] = sc.nextInt() + sum[i];
		}
		
		
		Map<Long, Integer> map = new HashMap<Long,Integer>();
		
		for(int i =0 ; i< n+1 ; i++){
			int value = map.getOrDefault(sum[i], 0);
			map.put(sum[i], value+1);
		}
		
		BigInteger res = BigInteger.valueOf(0);
		
		for(long value : map.values()){
			res = res.add(BigInteger.valueOf(value*(value-1)/2)); 
		}
		System.out.println(res);
	}
	
}

public class Main {
	public static void main(String[] args){
		Solver s  = new Solver();
		s.run();
	}
}
