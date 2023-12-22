import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); in.nextLine();
		ArrayList<Integer> ary = new ArrayList<Integer>();
		
		int tempInt = 0;
		for ( int i = 0; i < n; i++ ) {
			tempInt = in.nextInt(); in.nextLine();
			if ( !ary.contains(tempInt) ) {
				ary.add(tempInt);
			} else {
				ary.remove(ary.indexOf(tempInt));
			}
		}
		
		System.out.println(ary.size());
	}
}