import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		
		int n = cin.nextInt();
		cin.nextInt();
		cin.nextLine();
		
		String[] strs = new String[n];
		
		for (int i = 0; i < n; i ++) {
			strs[i] = cin.nextLine();
		}
		
		Arrays.sort(strs, (s1,s2) -> (s1+s2).compareTo(s2+s1));
		
		for (int i = 0; i < n; i ++) {
			System.out.print(strs[i]);
		}
	}

}

