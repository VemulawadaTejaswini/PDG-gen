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
			boolean[] flg = new boolean[n];
			for(int j=0;j<n;j++) {
				flg[j] = false;
			}
			
			for(int j=1;j<n;j++) {
				if(flg[j]) {
					continue;
				}
				
				if(flg[j-1]) {
					if(x[j-2]+l[j-2]>x[j]-l[j]) {
						ret++;
						flg[j] = true;
						j=1;
					}
				}else {
					if(x[j-1]+l[j-1]>x[j]-l[j]) {
						ret++;
						flg[j] = true;
						j=1;
					}
				}
				
				
				
			}
			
			//System.out.println(ret);
			System.out.println(n-ret);
	    }
		
	}
	
