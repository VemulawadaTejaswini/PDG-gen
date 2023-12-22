import java.util.*;
public class Main {

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			
		
		
		int n = sc.nextInt();
		
		
		Set<Integer> s = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			if(s.contains(a)) {
				System.out.println("No");
				return;
			}
			s.add(a);
		}
		
		System.out.println("Yes");
		
		
	}
	


}

 