import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		int n=scanner.nextInt();
		Map<String,Integer> data= new TreeMap<String,Integer>();
		
		for(int i=0;i<n;i++) {
			
			String buf=scanner.next();
			
			if(!data.containsKey(buf)) {
			
				data.put(buf,1);
			}else {
				data.put(buf,data.get(buf)+1);
			}
		}
		
		int m=scanner.nextInt();
		
		for(int i=0;i<m;i++) {
			
			String buf=scanner.next();
			
			if(data.containsKey(buf)) {
				data.put(buf,data.get(buf)-1);
			}
		}
		
		int max=-1;
		
		for(String key:data.keySet()) {
			
			int buf=data.get(key);
			
			if(max<buf) {
				max=buf;
			}
			
		}
		
		
		if(max>0) {
			System.out.println(max);
		}else {
			System.out.println("0");
		}
		scanner.close();

	}
}