import java.util.Scanner;

import java.util.*;
import static java.util.Comparator.*;

public class Main{
	static class V{
		long a;
		long b;
		long a(){
			return a;
		}
		long b(){
			return b;
		}
		V(long a, long b){
			this.a = a;
			this.b = b;
		}
	}
	
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n  = scan.nextInt();
		long m  = scan.nextLong();

		List<V> a = new ArrayList<V>(n);


		for (int i = 0; i < n; i++){
			a.add(new V(scan.nextLong(),scan.nextLong()));
		}

		a.sort(comparing(V::a));
		Iterator<V> it = 		a.iterator();

		long cur = 0;
		long sum = 0;
		while(it.hasNext()){
			V v = it.next();
			//			System.err.println(v.a());
			if(cur + v.b() < m) {
				cur += v.b();
				sum += v.b() * v.a();
			}else{
				sum += (m - cur) * v.a();
				System.out.println(sum);
				return;
			}
		}

	}

}
