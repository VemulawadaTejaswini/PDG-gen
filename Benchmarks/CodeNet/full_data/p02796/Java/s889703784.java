import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
			
			
			for(int i=0;i<n;i++) {
				int x = sc.nextInt();
				int l = sc.nextInt();
				map.put(x, l);
			}
			
			int[] x = new int[n];
			int[] l = new int[n];
			int i = 0;
			
			for(Map.Entry<Integer, Integer> e :map.entrySet()) {
				x[i] = e.getKey();
				l[i] = e.getValue();
				i++;
			}
			
			
			int ret = 0;
			for(int j=1;j<n;j++) {
				if(x[j-1]+l[j-1]>x[j]+l[j]) {
					ret++;
				}
				j++;
			}
			
			
			System.out.println(n-ret-1);
	    }
		
	}
	
