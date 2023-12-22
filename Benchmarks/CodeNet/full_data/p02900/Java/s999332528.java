import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Set<Long> getDivisors(long A){
		Set<Long> ret = new HashSet<Long>();
		ret.add(1L);
		for(long i = 2 ; i * i <= A ; ++i){
			if(A % i == 0){			
				ret.add(i);
				while(A % i == 0){
					A = A / i;
				}
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		Set<Long> AS = getDivisors(A);		
		Set<Long> common = new HashSet<Long>();
		for(long a : AS){
			if(B % a == 0){
				common.add(a);
			}
		}
		System.out.println(common.size());
		// 1 , 2 , 3, 5 , 11
	}
}
