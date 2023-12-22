import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Set<Integer> ACset = new HashSet<>();
		Set<Integer> WAset = new HashSet<>();
		int ac = 0;
		int wa = 0;
		int waCount = 0;
		
		for(int i = 0; i < M; i++) {
			int num = sc.nextInt();
			String value = sc.next();
			if(value.equals("AC")) {
				if(!ACset.contains(num)) {
					ac++;
					ACset.add(num);
					if(WAset.contains(num)) {
						wa += waCount;
						waCount = 0;
					}
				}
			}else {
				WAset.add(num);
				waCount++;
			}
		}

		System.out.println(ac + " " + wa);			
		sc.close();
	}
	
}