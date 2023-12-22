
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		int q = sc.nextInt();
		
		List<Integer> p = new ArrayList<Integer>();
		
		
		long os = 0;
		for(int i = 0 ; i < q; i++) {
			int t = sc.nextInt();
			
			if(t == 1) {
				int a = sc.nextInt();
				p.add(a);
				
				int b = sc.nextInt();
				os += b;
			}else {
				
				Collections.sort(p);
				
				long tar = p.get((p.size()-1)/2);
				long d = 0;
				for(int x :p) {
					d += Math.abs(x - tar);
				}
				System.out.println(tar+" "+(d+ os));
			}
			
		}
	}
}
