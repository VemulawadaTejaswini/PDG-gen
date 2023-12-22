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
			int max11 = 0;
			int key11 = 0;
			int max12 = 0;
			int key12 = 0;
			
			int sum2 = 0;
			int max21 = 0;
			int key21 = 0;
			int max22 = 0;
			int key22 = 0;
			
			for(int i=0;i<n/2;i++) {
				m1.merge(sc.nextInt(), 1, Integer::sum);
				m2.merge(sc.nextInt(), 1, Integer::sum);
			}
			
			for(Map.Entry<Integer, Integer> e : m1.entrySet()) {
				sum1 += e.getValue();
				if(max11<=e.getValue()) {
					max12 = max11;
					max11 = Math.max(max11, e.getValue());
					key12 = key11;
					key11 = e.getKey();
				}
				
			}
			
			for(Map.Entry<Integer, Integer> e : m2.entrySet()) {
				sum2 += e.getValue();
				if(max21<=e.getValue()) {
					max22 = max21;
					max21 = Math.max(max21, e.getValue());
					key22 = key21;
					key21 = e.getKey();
				}
			}
			
			if(m1.equals(m2)) {
				System.out.println(n/2);
			}else {
				if(key11!=key21) {
					System.out.println(sum1+sum2-m1.get(key11)-m2.get(key21));
				}else {
					if(m1.get(key11)+m2.get(key22)>m1.get(key12)+m2.get(key21)) {
						System.out.println(sum1+sum2-m1.get(key11)-m2.get(key22));
					}else {
						System.out.println(sum1+sum2-m1.get(key12)-m2.get(key21));
					}
				}
			}
			
			
			
	    }
		
	}
	
