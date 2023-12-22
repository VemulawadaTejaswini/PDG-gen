import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int []a = new int[N];
			Map<Integer,Integer>map = new TreeMap<Integer,Integer>();
			for(int i = 0;i<N;i++) {
				a[i] = scan.nextInt();
				
				if(map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i])+1);
				}else {
					map.put(a[i], 1);
				}
			
			}
			
			
			int count = 0;
			for(Integer key:map.keySet()) {
				if(key>map.get(key))count+=map.get(key);
				if(key<map.get(key))count+=(map.get(key)-key);
				
				//System.out.print(key);
				//System.out.print(" ");
				//System.out.println(map.get(key));
			}
			System.out.println(count);


			
		}
		
		
	}
		

}
