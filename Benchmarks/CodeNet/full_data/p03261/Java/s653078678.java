
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Map<String,Integer> set = new HashMap<>(); 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String old = null;
		for (int i=0;i<n;i++) {
			String moi = sc.next();
			if (old==null) {
			} else {
				if (old.charAt(old.length()-1)!=moi.charAt(0)) {
					System.out.println("No");
					return;
				}
				if (set.get(moi)!=null) {
					System.out.println("No");
					return;
				}
				
			}
			old = moi;
			set.put(moi,1);
		}
		System.out.println("Yes");
	}
}
