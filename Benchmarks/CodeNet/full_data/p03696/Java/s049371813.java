import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); in.nextLine();
		String s = in.nextLine();
		
		String f = "."+s+".";
		String[] ary = f.split("");
		// System.out.println(Arrays.toString(ary));
		
		String left = "";
		String right = "";
		boolean matchFound = false;
		
		for ( int i = 1; i < ary.length; i++ ) {
			if ( ary[i].equals(")") ) {
				for ( int j = i-1; j >= 0; j-- ) {
					if ( ary[j].equals("(") ) {
						matchFound = true;
						ary[i] = ".";
						ary[j] = ".";
						break;
					}
				}
				// System.out.println(matchFound);
				if ( matchFound == false ) {
					left += "(";
					// matchFound = false;
				}
			} else if ( ary[i].equals("(") ) {
				for ( int k = i+1; k < ary.length; k++ ) {
					if ( ary[k].equals(")") ) {
						matchFound = true;
						ary[i] = ".";
						ary[k] = ".";
						break;
					}
				}
				if ( matchFound == false ) {
					right += ")";
				}
			}
			matchFound = false;
			// System.out.println(Arrays.toString(ary));
		}
		
		
		System.out.println(left+s+right);
	}
}