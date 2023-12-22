import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
	public static void main(String[] args) {
		execute();
	}
 
	private static void execute() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String s = sc.next();
			
			Set<Integer> first = new HashSet<>();
			long ans = 0;
			for(int x=0; x<n-2; x++) {
				if(first.contains((int)s.charAt(x))) {
					continue;
				}
				first.add((int)s.charAt(x));
				Set<Integer> second = new HashSet<>();
				for(int y=x+1; y<n-1; y++) {
					if(second.contains((int)s.charAt(y))) {
						continue;
					}
					second.add((int)s.charAt(y));
					Set<Integer> third = new HashSet<>();
					for(int z=y+1; z<n; z++) {
						if(third.contains((int)s.charAt(z))) {
							continue;
						}
						third.add((int)s.charAt(z));
						ans++;
					}
				}
			}
			
			System.out.println(ans);
			
		}
	}
}