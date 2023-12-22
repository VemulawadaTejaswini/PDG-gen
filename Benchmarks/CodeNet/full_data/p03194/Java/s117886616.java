import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
		long p = sc.nextLong();
		Map<Long,Long> map = new HashMap<>();

		long i = 2L;

		if(p ==1L){
			System.out.println(1);		
		}else if (n ==1L){
			System.out.println(p);
		}else{
			while(i<=p){
				// System.out.print(i);
				// System.out.print(" ");
				// System.out.println(p);
				if(p%i==0L){
					if(Objects.isNull( map.get(i))){
						map.put(i,1L);
					}else{
						long currentCount = map.get(i);
						map.put(i,currentCount+1L);
					}
					i =2L;
					p = p/i;
				} else{
					i++;
				}
			}
			// System.out.println(map.keySet());
			long result =1L;
			for (long key : map.keySet()) {
				// System.out.println(key + " to " +map.get(key));
				if(map.get(key)>=n){
					result = result * ((long)Math.pow(key,(map.get(key)/n)));
				}
			}
			
			System.out.println(result);
		}
	}

}