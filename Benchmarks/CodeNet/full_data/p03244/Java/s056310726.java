import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			TreeMap<Integer,Integer> m1 = new TreeMap<Integer,Integer>();
			TreeMap<Integer,Integer> m2 = new TreeMap<Integer,Integer>();
			int sum1 = 0;
			int max1 = 0;
			int key1 = 0;
			
			int sum2 = 0;
			int max2 = 0;
			int key2 = 0;
			
			for(int i=0;i<n/2;i++) {
				m1.merge(sc.nextInt(), 1, Integer::sum);
				m2.merge(sc.nextInt(), 1, Integer::sum);
			}
			
			for(Map.Entry<Integer, Integer> e : m1.entrySet()) {
				sum1 += e.getValue();
				if(max1<=e.getValue()) {
					max1 = Math.max(max1, e.getValue());
					key1 = e.getKey();
				}
				
			}
			
			for(Map.Entry<Integer, Integer> e : m2.entrySet()) {
				sum2 += e.getValue();
				if(max2<=e.getValue()) {
					max2 = Math.max(max2, e.getValue());
					key2 = e.getKey();
				}
			}
			if(m1.equals(m2)) {
				System.out.println(n/2);
			}else {
				System.out.println(sum1+sum2-m1.get(key1)-m2.get(key2));
			}
			
			
	    }
		
	}
	
