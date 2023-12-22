import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < N; i++) {
			map.put(sc.nextInt(), sc.nextInt());
		}
		
		map.entrySet().stream().sorted(java.util.Map.Entry.comparingByValue());

		long count = 0;
		long honsuu = 0;
		
		for(int i = 0; i < N; i++) {
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				for(int j = 0; j < entry.getValue(); j++) {
					if(honsuu < M) {
						honsuu++; 
						count+=entry.getKey();
					}else{
						System.out.println(count);
						return;
					}
				}
			}
		}
	}
}