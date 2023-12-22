import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		List<Integer> lsr = new ArrayList<Integer>();
		List<Integer> lsg = new ArrayList<Integer>();
		List<Integer> lsb = new ArrayList<Integer>();

		long f = 0;
		for ( int i=0; i<n; i++ ) {
			if ( s.charAt(i)=='R' ) {
				lsr.add(i);
				if ( lsg.size()<lsb.size() ) {
					f = f + getCombinationNumbers(i, lsg, lsb);
				} else {
					f = f + getCombinationNumbers(i, lsb, lsg);
				}
			} else if ( s.charAt(i)=='G' ) {
				lsg.add(i);
				if ( lsb.size()<lsr.size() ) {
					f = f + getCombinationNumbers(i, lsb, lsr);
				} else {
					f = f + getCombinationNumbers(i, lsr, lsb);
				}
			} else {
				lsb.add(i);
				if ( lsr.size()<lsg.size() ) {
					f = f + getCombinationNumbers(i, lsr, lsg);
				} else {
					f = f + getCombinationNumbers(i, lsg, lsr);
				}
			}
		}

		System.out.println(f);
	}

	private static long getCombinationNumbers(int last, List<Integer> l1, List<Integer> l2) {
		if ( l1.isEmpty() || l2.isEmpty() ) return 0;
		long g = 0;

		for ( int i=0; i<l1.size(); i++ ) {
			g = g + (long)l2.size();
			int num1 = l1.get(i);
			int num2 = num1*2 - last;
			if ( num2>=0 && l2.contains(num2) ) {
				g--;
			}
			if ( (last+num1)%2==0 && l2.contains((last+num1)/2) ) {
				g--;
			}
		}
		return g;
	}

}