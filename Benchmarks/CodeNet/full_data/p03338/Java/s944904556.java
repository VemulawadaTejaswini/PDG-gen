import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		ArrayList<String> sList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			sList.add(s.substring(i,(i+1)));
		}
		
		TreeSet<Integer> check = new TreeSet<>();
		
		for(int i = 0; i < n; i++) {
			int count = 0;
			TreeSet<String> first = new TreeSet<>();
			TreeSet<String> second = new TreeSet<>();
			
			for(int in = 0; in <= i; in++) {
				first.add(sList.get(in));
			}
			for(int in = (i+1); in < n; in++) {
				second.add(sList.get(in));
			}
			
			for(String st: first) {
				if(second.contains(st)) {
					count++;
				}
			}
			
			check.add(count);
		}
		
		System.out.println(check.last());
	}
}