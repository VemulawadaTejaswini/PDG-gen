import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		boolean distinct = true;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			if(set.contains(a)) {
				distinct = false;
				break;
			}
			else {
				set.add(a);
			}
		}
		
		System.out.println(distinct ? "YES" : "NO");
	}

}
