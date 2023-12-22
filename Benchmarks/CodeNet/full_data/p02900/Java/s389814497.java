import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	static Map<Long,Long> map= new TreeMap<>();
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  long a=sc.nextLong(),b=sc.nextLong();
	  long gcd=GCD(Math.min(a, b),Math.max(a, b));
	  primeEnum(gcd);
	  long res=map.size()+1;
	  //System.out.println(res*(res-1)/2+" "+gcd);
	  System.out.println(map.size()+1);
  }
	public static Map<Long,Long> primeEnum(long n) {
		for(long i=2;i<=Math.sqrt(n);i++) {
			if(n%i!=0)continue;
			long e=0;
			while(n%i==0) {
				e++;
				n/=i;
			}
			if(map.containsKey(i)) {
				map.put(i, e+map.get(i));
			}else {
				map.put(i, e);
			}
		}
		if(n!=1) {
			if(map.containsKey(n)) {
				map.put(n, 1+map.get(n));
			}else {
				map.put(n, 1L);
			}
		}
		return map;
	}
	public static long GCD(long min,long max) {
		if(max%min==0)return min;
		else return GCD(max%min,min);
	}
}

