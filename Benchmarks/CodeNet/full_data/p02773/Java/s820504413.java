import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static int findAnyMatch(Object x, String[] arr) {		
		int counter = 0;
		for (int count = 0; count < arr.length; count++)
			if(x.equals(arr[count])) counter++;
		return counter;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt(); scan.nextLine();
		String[] strArray = new String[t];
		Set<String> setOfStr = new HashSet<String>();
		for (int count = 0; count < t; count++) {
			String s = scan.nextLine();
			strArray[count] = s; setOfStr.add(s);
		}
		Object[] x = setOfStr.toArray();
		int[] freq = new int[setOfStr.size()];
		for (int count = 0; count < freq.length; count++) {
			freq[count] = findAnyMatch(x[count], strArray);
		}
		
		List<Integer> indices = new ArrayList<Integer>();
		int max = freq[0];
		for (int count = 1; count < freq.length; count++) {
			if(freq[count] > max) max = freq[count];
			if(freq[count] ==  max) indices.add(count);
		}
		
		if(max == 1) System.out.println((String) x[indices.get(0)]);
		else {
			String[] forSorting = new String[indices.size()];
			for (int count = 0; count < indices.size(); count++)
				forSorting[count] = (String) x[indices.get(count)];
			Arrays.sort(forSorting);
			for (String string : forSorting) System.out.println(string);
		}
		scan.close();
	}
}
