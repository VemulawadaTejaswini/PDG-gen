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
		String[] arr = new String[t];
		Set<String> duplicates = new HashSet<>();
		for (int count = 0; count < t; count++) {
			String s = scan.nextLine();
			arr[count] = s; duplicates.add(s);
		}
		
		Object[] x = duplicates.toArray();
		int[] freq = new int[duplicates.size()];
		for (int count = 0; count < duplicates.size(); count++) {
			freq[count] = findAnyMatch(x[count], arr);
		}
		
		List<Integer> indices = new ArrayList<>();
		int max = freq[0];
		for (int count = 1; count < freq.length; count++) {
			if(freq[count] > max) max = freq[count];
		}
		for (int count = 0; count < freq.length; count++) {
			if(freq[count] ==  max) indices.add(count);
		}
		
		Arrays.sort(x);
		if(indices.size() == 1) System.out.println((String) x[indices.get(0)]);
		else {
			for (int count = 0; count < indices.size(); count++) {
				System.out.println((String) x[indices.get(count)]);
			}
		}
		scan.close();
	}
	
}
